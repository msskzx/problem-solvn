"""
https://leetcode.com/problems/surrounded-regions/
"""

class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m = len(board)
        n = len(board[0])

        def dfsT(i, j):
            if not (0 <= i < m and 0 <= j < n and board[i][j] == 'O'):
                return
            board[i][j] = 'T'
            dfsT(i + 1, j)
            dfsT(i - 1, j)
            dfsT(i, j + 1)
            dfsT(i, j - 1)

        # ignore border rows
        for i in range(m):
            dfsT(i, 0)
            dfsT(i, n - 1)

        # ignore border cols
        for i in range(n):
            dfsT(0, i)
            dfsT(m-1, i)
        
        for i in range(m):
            for j in range(n):
                if board[i][j] == 'T':
                    board[i][j] = 'O'
                else:
                    board[i][j] = 'X'

        return board
        