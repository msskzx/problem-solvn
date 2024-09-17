"""
https://leetcode.com/problems/number-of-islands
"""

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == '1':
                    count += 1
                    self.dfs(grid, i, j)
        return count
    
    def dfs(self, grid, i, j):
        if not (-1 < i < len(grid) and -1 < j < len(grid[0]) and grid[i][j] == '1'):
            return
        grid[i][j] = '0'
        self.dfs(grid, i+1, j)
        self.dfs(grid, i-1, j)
        self.dfs(grid, i, j+1)
        self.dfs(grid, i, j-1)
        
