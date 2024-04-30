"""
https://leetcode.com/problems/pascals-triangle-ii/submissions/1245396224/
"""
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        dp = [1]

        for i in range(1, rowIndex+1):
            cur = [1]
            for j in range(1, i):
                cur.append(dp[j-1] + dp[j])
            cur.append(1)
            dp = cur
        
        return dp