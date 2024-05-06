"""
https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/
"""

class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        return sum(x for i, x in enumerate(nums) if i.bit_count() == k)