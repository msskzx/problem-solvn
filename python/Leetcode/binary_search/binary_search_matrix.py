"""
https://leetcode.com/problems/search-a-2d-matrix/
"""

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        up = 0
        down = m - 1

        while up <= down:
            row = (down+up)//2

            if matrix[row][0] <= target and target <= matrix[row][n-1]:
                # target in current row
                # binary search in row
                l = 0
                r = n - 1
                while l <= r:
                    mid = (l+r)//2
                    print(matrix[row][mid])
                    if matrix[row][mid] == target:
                        return True
                    elif target < matrix[row][mid]:
                        r = mid - 1
                    else:
                        l = mid + 1
                return False
            elif target < matrix[row][0]:
                down = row - 1
            else:
                up = row + 1
        
        return False
            