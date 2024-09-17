"""
https://leetcode.com/problems/maximum-average-subarray-i/
"""

class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        sm = sum(nums[:k])
        avg = sm/k

        for i in range(k, len(nums)):
            sm = sm - nums[i - k] + nums[i]
            avg = max(avg, sm/k)
        
        return avg
        