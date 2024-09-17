"""
https://leetcode.com/problems/pacific-atlantic-water-flow/
"""

class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        pac = set()
        atl = set()
        rows = len(heights)
        cols = len(heights[0])

        def get_flow(i, j, visited, prev):
            if i < 0 or j < 0 or i == rows or j == cols or (i, j) in visited or heights[i][j] < prev:
                return

            visited.add((i, j))
            for dx, dy in [(0, 1), (1, 0), (-1, 0), (0, -1)]:
                get_flow(i + dx, j + dy, visited, heights[i][j])
        
        for i in range(rows):
            get_flow(i, 0, pac, heights[i][0])
            get_flow(i, cols - 1, atl, heights[i][cols - 1])

        for j in range(cols):
            get_flow(0, j, pac, heights[0][j])
            get_flow(rows - 1, j, atl, heights[rows - 1][j])
        return pac & atl
