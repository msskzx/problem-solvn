"""
https://leetcode.com/problems/count-elements-with-maximum-frequency/
"""

class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        freq = defaultdict(int)
        mx = res = 0
        for x in nums:
            freq[x] += 1
            mx = max(mx, freq[x])
        
        for k, v in freq.items():
            if v == mx:
                res += v
        
        return res
        