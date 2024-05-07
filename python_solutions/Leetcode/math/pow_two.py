"""
https://leetcode.com/problems/power-of-two/submissions/1250921016/
"""

class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        return (n > 0 and n.bit_count() == 1 and n % 2 == 0) or n == 1
        