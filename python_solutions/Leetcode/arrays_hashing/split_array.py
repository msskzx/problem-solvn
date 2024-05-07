"""
https://leetcode.com/problems/split-the-array/submissions/1251810629/
"""

class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        freq = defaultdict(int)
        for x in nums:
            freq[x] += 1
            if freq[x] > 2:
                return False
        return True