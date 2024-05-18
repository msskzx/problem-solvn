"""
https://leetcode.com/problems/jump-game-ii/
"""

class Solution:
    def jump(self, nums: List[int]) -> int:
        dp = [len(nums)] * len(nums)
        dp[0] = 0

        for i in range(1, len(nums)):
            for j in range(i+1):
                if nums[j] + j >= i:
                    dp[i] = min(dp[j] + 1, dp[i])
        
        return dp[-1]