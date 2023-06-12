import torch
from tqdm import tqdm
from SimpleNNModel import SimpleNNModel
import numpy as np

def create_tqdm_bar(iterable, desc):
    return tqdm(enumerate(iterable),total=len(iterable), ncols=150, desc=desc)

def train_model(model, train_loader, val_loader, loss_func, tb_logger, epochs=10, name="default"):
    """
    Train the classifier for a number of epochs.
    """
    loss_cutoff = len(train_loader) // 10
    optimizer = torch.optim.Adam(model.parameters(), model.hparams["learning_rate"])
    
    # The scheduler is used to change the learning rate every few "n" steps.
    scheduler = torch.optim.lr_scheduler.StepLR(optimizer, step_size=int(epochs * len(train_loader) / 5), gamma=model.hparams.get('gamma', 0.8))
    
    for epoch in range(epochs):
        
        # Training, update the parameters.
        model.train()  

        training_loss = []
        validation_loss = []
        
        # Create a progress bar for the training loop.
        training_loop = create_tqdm_bar(train_loader, desc=f'Training Epoch [{epoch + 1}/{epochs}]')
        for train_iteration, batch in training_loop:
            # Reset the gradients, otherwise they accumulate.
            optimizer.zero_grad() 
            # Get the x and labels from the batch, in the fashion we defined in the dataset and dataloader.
            x, labels = batch
            x, labels = x.to(model.device), labels.to(model.device) # Send the data to the model.device (GPU or CPU) - it has to be the same model.device as the model.

            pred = model(x) # Stage 1: Forward().
            print(labels.shape)
            labels = labels.unsqueeze(2)
            print(labels.shape)
            print(x.shape, labels.shape, pred.shape)
            loss = loss_func(pred, labels) # Compute the loss over the predictions and the ground truth.
            loss.backward()  # Stage 2: Backward().
            optimizer.step() # Stage 3: Update the parameters.
            scheduler.step() # Update the learning rate.


            training_loss.append(loss.item())
            training_loss = training_loss[-loss_cutoff:]

            # Update the progress bar.
            training_loop.set_postfix(curr_train_loss = "{:.8f}".format(np.mean(training_loss)), 
                                      lr = "{:.8f}".format(optimizer.param_groups[0]['lr'])
            )

            # Update the tensorboard logger.
            tb_logger.add_scalar(f'classifier_{name}/train_loss', loss.item(), epoch * len(train_loader) + train_iteration)

        # Validation stage, where we don't want to update the parameters. Pay attention to the classifier.eval() line
        # and "with torch.no_grad()" wrapper.
        model.eval()
        val_loop = create_tqdm_bar(val_loader, desc=f'Validation Epoch [{epoch + 1}/{epochs}]')
        
        with torch.no_grad():
            for val_iteration, batch in val_loop:
                x, labels = batch
                x, labels = x.to(model.device), labels.to(model.device)
                
                pred = model(x)
                loss = loss_func(pred, labels)
                validation_loss.append(loss.item())
                # Update the progress bar.
                val_loop.set_postfix(val_loss = "{:.8f}".format(np.mean(validation_loss)))

                # Update the tensorboard logger.
                tb_logger.add_scalar(f'classifier_{name}/val_loss', loss.item(), epoch * len(val_loader) + val_iteration)
        