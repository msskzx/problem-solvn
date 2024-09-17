"""
https://leetcode.com/problems/sum-of-unique-elements/submissions/1251807440/
"""

class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        freq = {}
        for x in nums:
            freq[x] = freq[x] + 1 if x in freq else 1
        
        return sum([k for k, v in freq.items() if v == 1])