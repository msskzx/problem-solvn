"""
https://leetcode.com/problems/palindromic-substrings/
"""

class Solution:
    def countSubstrings(self, s: str) -> int:
        c = 0
        for i in range(len(s)):
            l = i
            r = i
            while l >= 0 and r < len(s) and s[l] == s[r]:
                c += 1
                l -= 1
                r += 1
        
            l = i
            r = i + 1
            while l >= 0 and r < len(s) and s[l] == s[r]:
                c += 1
                l -= 1
                r += 1

        return c