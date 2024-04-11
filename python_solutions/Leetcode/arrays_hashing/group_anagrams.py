"""
https://leetcode.com/problems/group-anagrams/submissions/1229480258/
"""

class Solution(object):
    # m . n
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        groups = defaultdict(list)
        for x in strs:
            encoding = [0] * 26
            for c in x:
                encoding[ord(c) - ord('a')] += 1
            
            groups[tuple(encoding)].append(x)
        
        return groups.values()



class Solution2(object):
    # m . n . log n
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        groups = []
        for x in strs:
            appended = False
            for g in groups:
                if self.is_anagram(x, g[0]):
                    g.append(x)
                    appended = True
            if not appended:
                groups.append([x])
        return groups

    def is_anagram(self, x, y):
        """
        is anagram
        """
        return sorted(x) == sorted(y)
        