"""
https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum
"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    pos = neg = zero = 0
    n = len(arr)
    
    for x in arr:
        if x > 0:
            pos += 1
        elif x < 0:
            neg += 1
        else:
            zero += 1
    
    print(f'{pos/n:.6f}')
    print(f'{neg/n:.6f}')
    print(f'{zero/n:.6f}')

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
