"""
https://leetcode.com/problems/sum-of-all-subset-xor-totals/
"""

class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        subsets = []
        subset = []

        def dfs(i):
            if i > len(nums)-1:
                return subsets.append(subset.copy())
            subset.append(nums[i])
            dfs(i+1)
            subset.pop()
            dfs(i+1)
        
        dfs(0)
        res = 0
        for subset in subsets:
            cur = 0
            for x in subset:
                cur ^= x
            res += cur

        return res