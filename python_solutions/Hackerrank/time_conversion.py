"""
https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/
"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    # Write your code here
    if 'PM' in s and s[:2] != '12':
        h = (int(s[:2]) + 12) % 24
        s = str(h) + s[2:]
    if 'AM' in s and s[:2] == '12':
        s = '00' + s[2:]
    return s[:-2]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
