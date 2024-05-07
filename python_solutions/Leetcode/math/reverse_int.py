"""
https://leetcode.com/problems/reverse-integer/
"""

class Solution:
    def reverse(self, x: int) -> int:
        rev = 0
        n = abs(x)
        
        while n != 0:
            d = n % 10
            rev = rev * 10 + d
            n //= 10
        
        if x < 0:
            rev *= -1
        
        if -2**31 <= rev <= 2**31 - 1:
            return rev
        
        return 0
