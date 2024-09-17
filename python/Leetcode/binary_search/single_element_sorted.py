# https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1358862011/

class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        i = 0
        j = len(nums) - 1

        while i <= j:
            m =  i + ((j - i) // 2)

            if (m - 1 < 0 or nums[m] != nums[m - 1]) and (m + 1 == len(nums) or nums[m] != nums[m + 1]):
                return nums[m]

            left = m - 1  if nums[m] == nums[m - 1] else m
            if left % 2:
                j = m - 1
            else:
                i = m + 1
        