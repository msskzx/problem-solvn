"""
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
"""

class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        freq = [0] * 101
        dp = [0] * 101
        res = []
        
        for x in nums:
            freq[x] += 1

        for i in range(1, len(dp)):
            dp[i] = dp[i - 1] + freq[i - 1]
        
        for x in nums:
            res.append(dp[x])
        
        return res