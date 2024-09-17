"""
https://leetcode.com/problems/intersection-of-two-arrays-ii/
"""

class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        freq = defaultdict(int)
        for x in nums2:
            freq[x] += 1 
        for x in nums1:
            if x in freq:
                res.append(x)
                freq[x] -= 1
                if freq[x] == 0:
                    freq.pop(x)
                if not freq:
                    return res
        return res