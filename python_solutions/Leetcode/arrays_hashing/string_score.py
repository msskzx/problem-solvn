"""
https://leetcode.com/problems/score-of-a-string/description/
"""


class Solution:
    def scoreOfString(self, s: str) -> int:
        sm = 0
        for i in range(1, len(s)):
            sm += abs(ord(s[i]) - ord(s[i-1]))
        
        return sm