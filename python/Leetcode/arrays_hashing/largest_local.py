"""
https://leetcode.com/problems/largest-local-values-in-a-matrix
"""

class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        res = []
        for i in range(len(grid) - 2):
            row = []
            for j in range(len(grid) - 2):
                mx = max(max(r[j : j + 3]) for r in grid[i : i + 3])
                row.append(mx)
            res.append(row)
        return res
