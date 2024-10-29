# Describing Performance

## Latency and Response Time

response time + service time + queuing delays + latency

## Head-of-Line Blocking

first packet prevents subsequent packets from being processed. (network switching, routing, HTTP/1.1 single request/connection but HTTP/2 uses multiplexing)

## Mean vs. Percentiles

Mean is not a good estimate of latency. Median represents 50th percentile (p50) means half do better and half do worse. For outliers it is good to check p95, 99, 99.9. 

## Tail Latency Amplification

multiple requests for a number of services for the same user having a slow request and the rest having to wait for that request will cause an overall slow experience for many users.

## Exactly Once Semantics

second service continues publishing posts to the materialized timelines after first services crashes

## Chaos Engineering

Deliberately injecting faults to ensure system fault tolerance is regularly tested
