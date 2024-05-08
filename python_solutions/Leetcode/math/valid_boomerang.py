"""
https://leetcode.com/problems/valid-boomerang/
"""

class Solution:
    def isBoomerang(self, points: List[List[int]]) -> bool:
        # has area or slope of two pairs are equal
        area = 0.5 * abs(
            points[0][0] * (points[1][1] - points[2][1])
            + points[1][0] * (points[2][1] - points[0][1])
            + points[2][0] * (points[0][1] - points[1][1])
        )
        return area > 0
        