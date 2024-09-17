"""
https://leetcode.com/problems/palindrome-number/
"""
class Solution:
    def isPalindrome(self, x: int) -> bool:
        y = x
        revx = 0
        while y > 0:
            digit = y % 10
            y = y // 10
            revx = revx * 10 + digit
        
        return x == revx