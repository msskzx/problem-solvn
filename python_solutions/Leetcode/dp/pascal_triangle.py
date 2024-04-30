"""
https://leetcode.com/problems/pascals-triangle/description/
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        dp =[[1]]
        for i in range(1, numRows):
            dp.append([1])
            for j in range(1, i):
                dp[i].append(dp[i-1][j-1] + dp[i-1][j])
            dp[i].append(1)
        
        return dp
