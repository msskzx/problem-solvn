"""
https://leetcode.com/problems/maximum-height-of-a-triangle/
"""

class Solution:
    def maxHeightOfTriangle(self, red: int, blue: int) -> int:
        mn = min(red, blue)
        mx = max(red, blue)
        res = 0
        for _ in range(2):
            i = 1
            while True:
                if i % 2 == 1 and mn >= i:
                    mn -= i
                elif i % 2 == 0 and mx >= i:
                    mx -= i
                else:
                    i -= 1
                    break
                i += 1
            res = max(res, i)
            mn = max(red, blue)
            mx = min(red, blue)
        return res
        