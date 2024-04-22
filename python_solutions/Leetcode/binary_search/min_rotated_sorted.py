"""
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
"""

class Solution:
    def findMin(self, nums: List[int]) -> int:
        l = 0
        r = len(nums) - 1
        minx = nums[0]

        while l <= r:
            if nums[l] < nums[r]:
                minx = min(minx, nums[l])
                break
            k = (l+r)//2
            minx = min(minx, nums[k])
            if nums[k] >= nums[l]:
                l = k + 1
            else:
                r = k - 1
        
        return minx
        