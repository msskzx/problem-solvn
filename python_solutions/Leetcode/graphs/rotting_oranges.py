"""
https://leetcode.com/problems/rotting-oranges/
"""

class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        t = 0
        q = deque()
        fresh = 0
        direct = [[1, 0], [-1, 0], [0, 1], [0, -1]]

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 2:
                    q.append((i, j))
                elif grid[i][j] == 1:
                    fresh += 1
        
        while q and fresh > 0:
            for i in range(len(q)):
                print(q)
                i, j = q.popleft()
                for x, y in direct:
                    x += i
                    y += j
                    if (x < len(grid) and x > -1
                    and y < len(grid[0]) and y > -1
                    and grid[x][y] == 1):
                        grid[x][y] = 2
                        q.append((x, y))
                        fresh -= 1
            t += 1
        
        return t if not fresh else -1
        