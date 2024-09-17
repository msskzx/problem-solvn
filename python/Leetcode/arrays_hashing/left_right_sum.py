"""
https://leetcode.com/problems/left-and-right-sum-differences/submissions/1251798840/
"""

class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        right_sum = sum(nums)
        left_sum = 0
        res = []
        for x in nums:
            right_sum -= x
            res.append(abs(left_sum - right_sum))
            left_sum += x
        return res
        