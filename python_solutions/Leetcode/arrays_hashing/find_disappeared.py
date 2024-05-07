"""
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1250933612/
"""

class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        res = []
        freq = [0] * (len(nums) + 1)
        for x in nums:
            freq[x] = 1
        return [i for i, x in enumerate(freq) if x == 0][1:]
        
        # or set difference
        # or negate values which you can get to using the nums values, the positive remaining values indicate the result