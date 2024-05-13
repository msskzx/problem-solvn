"""
https://leetcode.com/problems/add-digits/
"""

class Solution:
    def addDigits(self, num: int) -> int:
        sm = 0
        while num > 9:
            sm = 0
            while num > 0:
                sm += num % 10
                num //= 10
            
            num = sm
        
        return num