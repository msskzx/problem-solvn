"""
https://www.hackerrank.com/challenges/one-week-preparation-kit-caesar-cipher-1
"""
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'caesarCipher' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER k
#

def caesarCipher(s, k):
    # Write your code here
    res = ""
    for i, c in enumerate(s):
        if c.isalpha():
            if c.islower():
                res += chr((ord(c) - ord('a') + k) % 26 + ord('a'))
            else:
                res += chr((ord(c) - ord('A') + k) % 26 + ord('A'))
        else:
            res += c
    return res
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    s = input()

    k = int(input().strip())

    result = caesarCipher(s, k)

    fptr.write(result + '\n')

    fptr.close()
