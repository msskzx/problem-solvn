# https://leetcode.com/problems/sort-array-by-parity/

class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        i = 0
        j = len(nums) - 1
        for x in nums:
            if x % 2 == 1:
                res[j] = x
                j -= 1
            else:
                res[i] = x
                i += 1
        return res
        