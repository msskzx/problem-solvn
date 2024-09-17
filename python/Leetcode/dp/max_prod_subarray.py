"""
https://leetcode.com/problems/maximum-product-subarray/
"""

class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        mn = mx = 1
        res = nums[0]

        for x in nums:
            mn, mx = min(mn * x, mx * x, x), max(mn * x, mx * x, x)
            res = max(res, mx)
        
        return res