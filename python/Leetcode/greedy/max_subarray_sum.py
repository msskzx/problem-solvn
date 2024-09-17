"""
https://leetcode.com/problems/maximum-subarray/
"""


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxx = nums[0]
        cur = 0

        for x in nums:
            if cur < 0:
                cur = 0
            
            cur += x
            maxx = max(maxx, cur)

        return maxx