# https://leetcode.com/problems/maximum-odd-binary-number/

class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        freq = Counter(s)
        return '1' * (freq['1'] - 1) + '0' * freq['0'] + '1'
        
