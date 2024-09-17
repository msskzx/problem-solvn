"""
https://leetcode.com/problems/height-checker/
"""

class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        c = 0
        expected = sorted(heights)
        for i in range(len(heights)):
            c += 1 if heights[i] != expected[i] else 0
        return c

