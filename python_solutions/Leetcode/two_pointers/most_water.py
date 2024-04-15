"""
https://leetcode.com/problems/container-with-most-water/description/
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        mx = 0
        i = 0
        j = len(height) - 1
        while i < j:
            mx = max(mx, (j - i) * min(height[i], height[j]))
            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return mx