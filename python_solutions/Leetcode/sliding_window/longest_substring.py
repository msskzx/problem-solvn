"""
https://leetcode.com/problems/longest-substring-without-repeating-characters/
"""

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = r = mx = 0
        while r < len(s):
            if s[r] not in s[l:r]:
                r += 1
            else:
                l += 1
                r = max(l, r)
            mx = max(mx, r-l)
        return mx
        