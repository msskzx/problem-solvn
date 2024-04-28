"""
https://leetcode.com/problems/roman-to-integer/
"""

class Solution:
    def romanToInt(self, s: str) -> int:
        roman_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }

        res = 0
        for i, c in enumerate(s):
            if i + 1 < len(s) and roman_int[c] < roman_int[s[i+1]]:
                res -= roman_int[c]
            else:
                res += roman_int[c]
            
        return res