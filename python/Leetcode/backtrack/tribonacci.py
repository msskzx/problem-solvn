"""
https://leetcode.com/problems/n-th-tribonacci-number/
"""

class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n < 3:
            return 1

        dp = [0, 1, 1]
        def trib(i):
            if i > n:
                return 0
            dp[0], dp[1], dp[2] = dp[1], dp[2], sum(dp)
            trib(i+1)
        trib(3)
        return dp[-1]