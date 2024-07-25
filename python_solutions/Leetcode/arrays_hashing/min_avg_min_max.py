"""
https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/
"""
class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        nums.sort()
        mn = nums[-1]
        for i in range(len(nums) // 2):
            mn = min(mn, (nums[i] + nums[len(nums) - i - 1]) / 2)
        return mn
        