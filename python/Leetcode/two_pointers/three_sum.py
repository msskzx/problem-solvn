"""
https://leetcode.com/problems/3sum/
"""

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        res = []

        for i, x in enumerate(nums):
            if i > 0 and x == nums[i-1]:
                # skip duplicates
                continue
            
            # find two nums sum = x
            l = i + 1
            r = len(nums)-1
            while l < r:
                # avoid duplicates
                cur_sum = nums[l] + nums[r] + x
                if cur_sum == 0:
                    # solution
                    res.append([x, nums[l], nums[r]])
                    l += 1
                    while nums[l] == nums[l-1] and l < r:
                        l+=1
                elif cur_sum < 0:
                    l += 1
                else:
                    r -= 1
        return res
        