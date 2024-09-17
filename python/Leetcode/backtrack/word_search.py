# https://leetcode.com/problems/word-search/

class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        ROWS = len(board)
        COLS = len(board[0])

        def dfs(i, j, idx, path):
            if idx == len(word):
                return True
            
            if idx > len(word) or i < 0 or i >= ROWS or j < 0 or j >= COLS or (i, j) in path or board[i][j] != word[idx]:
                return False
            
            res = False
            dirs = [(1, 0), (0, 1), (-1, 0), (0, -1)]
            path.add((i, j))
            for dx, dy in dirs:
                res = res or dfs(i + dx, j + dy, idx + 1, path)
            path.remove((i,j))
            return res
        
        # call for each cell return true if you find one true
        res = False
        for i in range(ROWS):
            for j in range(COLS):
                res = dfs(i, j, 0, set())
                if res:
                    return True
        
        return False
                