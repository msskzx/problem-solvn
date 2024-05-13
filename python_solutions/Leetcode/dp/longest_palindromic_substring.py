"""
https://leetcode.com/problems/longest-palindromic-substring/
"""

class Solution:
    def longestPalindrome(self, s: str) -> str:
        mx = s[0]
        for i in range(len(s)):
            l = i - 1
            r = i + 1
            while l >= 0 and r < len(s) and s[l] == s[r]:
                l -= 1
                r += 1
            cur = s[l+1: r]

            if len(cur) > len(mx):
                mx = cur
        
            if i + 1 == len(s):
                break

            if s[i] != s[i+1]:
                continue

            l = i - 1
            r = i + 2
            while l >= 0 and r < len(s) and s[l] == s[r]:
                l -= 1
                r += 1
            cur = s[l+1: r]
            
            if len(cur) > len(mx):
                mx = cur

        return mx
