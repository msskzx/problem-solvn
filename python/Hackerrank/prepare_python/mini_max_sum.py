"""
https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/
"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # sort, min is first, max is last -> O(nlgn)
    arr.sort()
    print(sum(arr[:len(arr)-1]), sum(arr[1:]))
    # or find min, max, sum all then subtract min, max -> O(n)

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
