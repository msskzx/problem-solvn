"""
https://leetcode.com/problems/sqrtx/
"""

class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        
        lo = 1
        hi = x // 2
        while lo <= hi:
            k = (lo + hi) // 2
            if k * k == x:
                return k
            if k * k < x:
                lo = k + 1
            else:
                hi = k - 1
        return hi
        