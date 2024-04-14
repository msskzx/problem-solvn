"""
https://leetcode.com/problems/valid-sudoku/
"""

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # check rows
        for row in board:
            if not self.is_valid(row):
                return False

        # check cols
        for i in range(9):
            col = [board[j][i] for j in range(9)]
            if not self.is_valid(col):
                return False

        # check 3 x 3 grids
        for m in range(3):
            for n in range(3):
                grd = []
                for i in range(3):
                    for j in range(3):
                        grd.append(board[m * 3 + i][n * 3 + j])

                if not self.is_valid(grd):
                    return False
            
        return True

    def is_valid(self, a):
        # digits 1-9 without repetition
        freq = [0] * 9
        for x in a:
            if x == '.':
                continue
            x = int(x)
            if x not in range(1, 10):
                return False
            freq[x-1] += 1
            if freq[x-1] > 1:
                return False
        
        return True