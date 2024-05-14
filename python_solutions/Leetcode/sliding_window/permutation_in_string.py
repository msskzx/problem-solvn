"""
https://leetcode.com/problems/permutation-in-string/
"""

class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        freq1 = {}
        for x in s1:
            freq1[x] = 1 + freq1.get(x, 0)
        
        i = 0
        j = len(s1) - 1
        freq2 = {}
        for x in s2[i : j + 1]:
            freq2[x] = 1 + freq2.get(x, 0)

        while j < len(s2):
            perm = True
            for k, v in freq1.items():
                if k not in freq2 or v != freq2[k]:
                    perm = False

            if perm:
                return True

            j += 1
            if j < len(s2):
                freq2[s2[i]] -= 1
                freq2[s2[j]] = 1 + freq2.get(s2[j], 0)
            i += 1

        return False