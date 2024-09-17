"""
https://leetcode.com/problems/permutation-difference-between-two-strings/description/
"""

class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        s_i = {}
        t_i = {}
        for i in range(len(s)):
            s_i[s[i]] = i
            t_i[t[i]] = i

        sm = 0
        for i in range(len(s)):
            sm += abs(s_i[s[i]] - t_i[s[i]])
        return sm
        