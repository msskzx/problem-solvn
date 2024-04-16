"""
https://leetcode.com/problems/counting-bits/submissions/1233663269/
"""

class Solution:
    def countBits(self, n: int) -> List[int]:
        dp = [0]
        offset = 1
        for i in range(1, n+1):
            dp.append(1+dp[i-offset])
            if offset == i:
                offset <<= 1
        return dp
        