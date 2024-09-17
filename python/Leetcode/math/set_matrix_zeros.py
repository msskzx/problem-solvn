"""
https://leetcode.com/problems/set-matrix-zeroes/
"""

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rows = set()
        cols = set()

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if not matrix[i][j]:
                    rows.add(i)
                    cols.add(j)

        for i in rows:
            for j in range(len(matrix[0])):
                matrix[i][j] = 0

        for j in cols:
            for i in range(len(matrix)):
                matrix[i][j] = 0
        