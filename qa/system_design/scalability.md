# Scalability

## How to describe load?

ratio of reads to writes, hit rate on cache, number of data items per user.

## How to test load?

- increase load, keep resrouces, check performance
- increase load, increase resources to keep same performance

## Shared-memory Architecture

Parallelism on a single machine by sharing RAM using threads and processes.

## Shared-disk Architecture

The data is stored on several machines which are connected using Network-Attached Storage (NAS) or Storage Area Network (SAN). Locking overhead limits scalability.

## Shared-nothing Architecture

horizontal scaling where each node has its own resrouces, communication between nodes is done at the software level.


