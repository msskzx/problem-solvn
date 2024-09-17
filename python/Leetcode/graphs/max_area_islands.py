"""
https://leetcode.com/problems/max-area-of-island/
"""

class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        def dfs(i, j):
            if (i >= len(grid) or i < 0
            or j < 0 or j >= len(grid[0])
            or not grid[i][j]):
                return 0

            grid[i][j] = 0
            return 1 + dfs(i+1, j) + dfs(i - 1, j) + dfs(i, j + 1) + dfs(i, j - 1)

        mx = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                mx = max(mx, dfs(i, j))
        return mx