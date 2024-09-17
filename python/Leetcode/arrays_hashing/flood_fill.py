"""
https://leetcode.com/problems/flood-fill/description/
"""

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        c = image[sr][sc]
        visited = [[0] * len(image[0]) for _ in image]
        def dfs(i, j):
            if i < 0 or i >= len(image) or j < 0 or j >= len(image[0]):
                return
            
            if visited[i][j] or image[i][j] != c:
                return

            image[i][j] = color
            visited[i][j] = 1
            
            dfs(i + 1, j)
            dfs(i - 1, j)
            dfs(i, j + 1)
            dfs(i, j - 1)
        
        dfs(sr, sc)
        return image
