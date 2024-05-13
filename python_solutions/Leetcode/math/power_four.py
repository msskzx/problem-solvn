"""
https://leetcode.com/problems/power-of-four/
"""

class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        return n > 0 and 4**(round(log(n, 4))) == n
        