"""
https://leetcode.com/problems/reverse-words-in-a-string/description/
"""

class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        words.reverse()
        return ' '.join(words)
        