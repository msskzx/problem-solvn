"""
https://leetcode.com/problems/search-in-rotated-sorted-array/
"""

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l = 0
        r = len(nums) - 1

        while l <= r:
            k = (l+r)//2
            if nums[k] == target:
                return k

            if nums[l] <= nums[k]:
                # left side is sorted
                if nums[l] <= target < nums[k]:
                    r = k - 1
                else:
                    l = k + 1
            else:
                # right side is sorted
                if nums[k] < target <= nums[r]:
                    l = k + 1
                else:
                    r = k - 1

        return -1