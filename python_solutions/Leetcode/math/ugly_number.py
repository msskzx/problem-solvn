"""
https://leetcode.com/problems/ugly-number/
"""

class Solution:
    def isUgly(self, n: int) -> bool:
        if n == 0:
            return False
        
        a = [2, 3, 5]
        for x in a:
            while n % x == 0:
                n //= x
        
        return n == 1
        