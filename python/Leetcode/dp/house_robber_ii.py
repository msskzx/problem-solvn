"""
https://leetcode.com/problems/house-robber-ii/
"""

class Solution:
    def rob(self, nums: List[int]) -> int:
        return max(nums[0], self.helper(nums[1:]), self.helper(nums[:-1]))

    def helper(self, nums):
        dp = [0, 0]
        for x in nums:
            cur = max(dp[0] + x, dp[1])
            dp = [dp[1], cur]
        
        return dp[1]
        