import torch
import torch.nn as nn
import torch.nn.functional as F
from torch.utils.data import DataLoader, random_split
from torch.utils.data.sampler import SubsetRandomSampler, RandomSampler, SequentialSampler
import numpy as np
from tqdm import tqdm

class SimpleNNModel(nn.Module):
    
    def __init__(self, hparams):
        super().__init__()

        # init
        self.hparams = hparams
        self.model = None
        self.device = hparams.get("device", torch.device("cuda:0" if torch.cuda.is_available() else "cpu"))

        # layers
        self.model = nn.Sequential(
            nn.Linear(self.hparams['input_size'], self.hparams['hidden_size']),
            nn.BatchNorm1d(self.hparams['hidden_size']),
            nn.ReLU(),
            nn.Dropout(p=self.hparams['dropout']),
            nn.Linear(self.hparams['hidden_size'], self.hparams['hidden_size']//2),
            nn.BatchNorm1d(self.hparams['hidden_size']//2),
            nn.ReLU(),
            nn.Dropout(p=self.hparams['dropout']),
            nn.Linear(self.hparams['hidden_size']//2, self.hparams['num_classes']),
        )

    def forward(self, x):
        return self.model(x)
    
    def general_step(self, batch, batch_idx, mode):
        x, targets = batch
        targets = targets.unsqueeze(2)
        
        # forward pass
        out = self.forward(x)

        # loss
        loss = F.binary_cross_entropy(out, targets)

        preds = out.argmax(axis=1)
        n_correct = (targets == preds).sum()
        n_total = len(targets)
        return loss, n_correct, n_total
    
    def general_end(self, outputs, mode):
        # average over all batches aggregated during one epoch
        avg_loss = torch.stack([x[mode + '_loss'] for x in outputs]).mean()
        length = sum([x[mode + '_n_total'] for x in outputs])
        total_correct = torch.stack([x[mode + '_n_correct'] for x in outputs]).sum().cpu().numpy()
        acc = total_correct / length
        return avg_loss, acc
    
    def training_step(self, batch, batch_idx):
        loss, n_correct, n_total = self.general_step(batch, batch_idx, "train")
        self.log('loss',loss)
        return {'loss': loss, 'train_n_correct':n_correct, 'train_n_total': n_total}

    def validation_step(self, batch, batch_idx):
        loss, n_correct, n_total = self.general_step(batch, batch_idx, "val")
        self.log('val_loss',loss)
        return {'val_loss': loss, 'val_n_correct':n_correct, 'val_n_total': n_total}
    
    def test_step(self, batch, batch_idx):
        loss, n_correct, n_total = self.general_step(batch, batch_idx, "test")
        return {'test_loss': loss, 'test_n_correct':n_correct, 'test_n_total': n_total}

    def validation_epoch_end(self, outputs):
        avg_loss, acc = self.general_end(outputs, "val")
        self.log('val_loss',avg_loss)
        self.log('val_acc',acc)
        return {'val_loss': avg_loss, 'val_acc': acc}

    def configure_optimizers(self):
        return torch.optim.Adam(self.model.parameters(), self.hparams["learning_rate"])

    def getTestAcc(self, loader):
        self.model.eval()
        self.model = self.model.to(self.device)

        scores = []
        labels = []

        for batch in tqdm(loader):
            X, y = batch
            X = X.to(self.device)
            score = self.forward(X)
            scores.append(score.detach().cpu().numpy())
            labels.append(y.detach().cpu().numpy())

        scores = np.concatenate(scores, axis=0)
        labels = np.concatenate(labels, axis=0)

        preds = scores.argmax(axis=1)
        acc = (labels == preds).mean()
        return preds, acc

