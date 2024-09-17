"""
https://leetcode.com/problems/decode-xored-array/submissions/1251794769/
"""

class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        res = [first]
        cur = first
        for x in encoded:
            cur = cur ^ x
            res.append(cur)
        
        return res