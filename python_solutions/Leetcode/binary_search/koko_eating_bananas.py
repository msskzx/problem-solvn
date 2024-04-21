"""
https://leetcode.com/problems/koko-eating-bananas/
"""

import math

class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l = 1
        r = max(piles)
        res = r

        while l <= r:
            k = (l+r) // 2
            cur_h = self.calc_h(piles, k)
            
            if cur_h > h:
                l = k + 1
            else:
                r = k - 1
                res = min(res, k)
        
        return res


    def calc_h(self, a, k):
        h = 0
        for x in a:
            h += math.ceil(x / k)
        return h