"""
https://leetcode.com/problems/largest-rectangle-in-histogram/
"""

class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        area = 0

        for i, x in enumerate(heights):
            if not stack or x >= stack[-1][1]:
                stack.append([i, x])
            else:
                j = 0
                while stack and  x < stack[-1][1]:
                    j, y = stack.pop()
                    area = max(area, (i-j) * y)
                stack.append([j, x])

        while stack:
            i, x = stack.pop()
            area = max(area, (len(heights) - i) * x)
        
        return area
        