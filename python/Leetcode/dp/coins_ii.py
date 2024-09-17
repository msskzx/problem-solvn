# https://leetcode.com/problems/coin-change-ii/description/

class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        dp = [0] * (amount + 1)
        dp[0] = 1

        for i in range(len(coins) - 1, -1, -1):
            next_dp = [0] * (amount + 1)
            next_dp[0] = 1

            for j in range(1, amount + 1):
                next_dp[j] = dp[j]
                if j - coins[i] >= 0:
                    next_dp[j] += next_dp[j - coins[i]]
            dp = next_dp
        
        return dp[amount]
        