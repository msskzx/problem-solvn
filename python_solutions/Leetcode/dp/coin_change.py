"""
https://leetcode.com/problems/coin-change/description/
"""

class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [amount+1] * (amount+1)
        dp[0] = 0
        for i in range(1, amount+1):
            for x in coins:
                if i >= x:
                    dp[i] = min(dp[i], 1 + dp[i-x])
            
        return dp[-1] if dp[-1] != amount+1 else -1



        