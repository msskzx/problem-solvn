"""
https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
"""

class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        points.sort(key=lambda point:point[0])
        mx = 0
        for i in range(1, len(points)):
            mx = max(mx, points[i][0] - points[i-1][0])
        return mx
