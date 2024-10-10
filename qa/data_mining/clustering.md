# Data Mining: Metric Clustering

## What can edges and nodes represent in social networks?

Nodes: personal data (name, age), contextual data (location, velocity)
Edges: averaged data (relation), contextual data (about relation)

## State different measure scales

- Nominal, (=, !=), (Host, Heiner, Manon)
- Ordinal, (>, <), (Grades)
- Interval, (+, -), (Celsius)
- Proportional, (*, /), (Kelvin, Minutes)

## How do we compute clusters in metric spaces?

Using mean squared error of distances

## Group models: How do we compute socially meaningful clusters in metric spaces (and thus avoid quasi-groups)?

- compute clusters over a period of time (will appear again)
- establish threshold for distance in clusters (social distance)
- Include velocities (divergent means no group)

## Explain exclusive or non-exclusive, crisp or fuzzy, hierarchical or non-hierarchical

exclusive: non-overlapping
non-exclusive: overlapping
crisp: member of single cluster (conventional characteristic function)
fuzzy: member of more than one cluster (membership matrix) (fuzzy membership matrix)
hierarchical: tree structure (dendogram) of the cluster, cut into clusters on any level
non-hierarchical: direct clusters (no tree) (k-means)

## What is K-means objective

Optimize intra cluster coherence in the form of distance between point and cluster center (prototype) using mean square error

## What are K-means steps

- init k, random prototypes
- repeat:
 - add each point to a cluster using nearest neighbor rule
 - compute the new prototypes
 - stop if difference between new and old clusters reached the stopping criteria

## How do we determine correct number K of clusters?

try different k and choose the one with best cluster quality measure (Dunn-index, Entropy based indices)

## K-means Disadvantages

- spherical
- k
- no noise

## DBSCAN Steps

- init: minPts, e
- repeat:
 - visit unseen x
  - if in neighborhood start a new cluster
  - else noise

## DBSCAN advantages

- no k
- arbitrary shaped clusters
- noise

## DBSCAN disadvantages

- minPts, e
- original has fixed minPts, e

## Fuzzy C-means

- membership matrix
r_nk^m ||x_n - m_k||^2

## What happens to C-means when m -> 1 and m -> inf

m -> 1: K-means (crisp)
m -> inf: r_nk -> 1/k 

## why for all x_n sum(r_nk) = 1 and for all C_k sum(r_nk) > 0

first ensures the membership of point in all clusters sum to 1 to eliminate that the point is clustered. second ensures that each cluster has some points

## Gaussian Mixture Models Advantages

- elliptical shapes

## Explain traditional machine learning objective

for a distribution p(x|theta) where theta is the parameters and x is iid data the objective is to find theta that best explains the data

## what does iid mean

identically independently distributed p(X|theta) = mult(p(x_i|theta))

## What is the paradigm of the „Maximum Likelihood concept“?

following a frequentist paradigm for a statistical model we want to find the parameters maximizing the likelihood of observing the data given this model

p(X|theta) is likelihood
theta_ml = argmax_theta p(X|theta)

## Why do we take the logarithm of the likelihood? How do we choose the base of the logarithm ? Why?

to convert multiplication into summation to simplify calculations and provide mathematical stability for small number multiplication. also log is a monotonic function so objective function will not change behavior

normally natural log is used because it has interesting properties.

## Can You explain the formula for the responsibilities from an intuitive point of view?

the responsibilities r_nk (kth component, nth data point) represent the soft assignment of the data point to each Gaussian in the mixture with varying degree of responsibility.

## What is 1 of K representation

one hot encoding where a k-dim binary represents a class by setting one bit to 1

## What is Expectation Maximization (EM) for Gaussian Mixtures

- init means, covariances, mixing coefficients, eval init log likelihood
- E step: evaluate responsibilities using current parameters
- M step: re-estimate parameters using current responsibilities
- evaluate log likelihood and check for convergence of parameters or log likelihood to stop or repeat

## What is the goal of data mining?

find interesting patterns in large sets of data

## Explain the following models: parametric, non-parametric, probabilistic, non-probabilistic, generative, discriminative

parametric: GMM
non-parametric: KNN
probabilistic:
non-probabilistic:
generative:
discriminative:

## Informally explain the nature and geometrical interpretation of the GMM quantities μk and Σk

- μk represents the center of the kth cluster and the point where the data has highest density
- Σk represents the spread and shape of the cluster and controls the size and orientation
