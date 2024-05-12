"""
https://leetcode.com/problems/longest-repeating-character-replacement/
"""

class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        l = r = mxf = res = 0
        freq = {}

        while r < len(s):
            freq[s[r]] = 1 + freq.get(s[r], 0)
            mxf = max(mxf, freq[s[r]])
            
            while r - l  + 1 - mxf > k:
                freq[s[l]] -= 1
                l += 1
            
            res = max(res, r - l + 1)
            r += 1
        return res