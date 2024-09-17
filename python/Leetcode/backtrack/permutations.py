"""
https://leetcode.com/problems/permutations/description/
"""

class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        if len(nums) == 1:
            return [nums.copy()]
        
        for _ in range(len(nums)):
            x = nums.pop(0)

            perms = self.permute(nums)

            for perm in perms:
                perm.insert(0, x)

            res.extend(perms)
            nums.append(x)
        
        return res
