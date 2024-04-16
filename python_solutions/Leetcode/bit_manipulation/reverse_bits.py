"""
https://leetcode.com/problems/reverse-bits/description/
"""

class Solution:
    def reverseBits(self, n: int) -> int:
        bit = 0
        res = 0
        for i in range(32): 
            bit = n & 1
            res = res | (bit << (31 - i))
            n >>= 1
        return res