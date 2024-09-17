# https://leetcode.com/problems/island-perimeter/

class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        res = 0

        def count(x, y):
            if grid[x][y] == 0:
                return 0

            c = 0
            for dx, dy in [(-1, 0), (1, 0), (0, 1), (0, -1)]:
                if not(0 <= dx + x < len(grid)) or not(0 <= dy + y < len(grid[0])) or grid[dx+x][dy+y] == 0:
                    c += 1
            return c

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                res += count(i, j)

        return res
        