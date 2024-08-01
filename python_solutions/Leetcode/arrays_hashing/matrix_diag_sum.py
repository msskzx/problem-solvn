"""
https://leetcode.com/problems/matrix-diagonal-sum/
"""

class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        sum1 = sum2 = 0
        for i in range(len(mat)):
            sum1 += mat[i][i]
            sum2 += mat[i][len(mat) - 1 - i]
        mn = mat[len(mat)//2][len(mat)//2] if len(mat) % 2 == 1 else 0
        return sum1 + sum2 - mn