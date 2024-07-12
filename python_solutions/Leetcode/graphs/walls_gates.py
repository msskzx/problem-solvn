"""
https://leetcode.com/problems/walls-and-gates/description/
"""

class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        INF = 2147483647
        q = deque()
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 0:
                    q.append((i, j))
        
        while q:
            q2 = deque()
            while q:
                i, j = q.pop()
                for dx, dy in [(-1, 0), (0, -1), (1, 0), (0, 1)]:
                    dx += i
                    dy += j
                    if 0 <= dx < len(grid) and 0 <= dy < len(grid[0]) and grid[dx][dy] == INF:
                        q2.append((dx, dy))
                        grid[dx][dy] = grid[i][j] + 1
            
            q = q2
        