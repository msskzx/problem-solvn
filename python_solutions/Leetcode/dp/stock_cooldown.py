# https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        dp = {}

        def dfs(i, can_buy):
            if i >= len(prices):
                return 0
            
            if (i, can_buy) in dp:
                return dp[(i, can_buy)]

            cooldown = dfs(i + 1, can_buy)

            if can_buy:
                buy = dfs(i + 1, not can_buy) - prices[i]
                dp[(i, can_buy)] = max(cooldown, buy)
            else:
                sell = dfs(i + 2, not can_buy) + prices[i]
                dp[(i, can_buy)] = max(cooldown, sell)
            
            return dp[(i, can_buy)]
        
        return dfs(0, True)
