# https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        i = 0
        while i <= len(haystack) - len(needle):
            flag = True
            for j in range(len(needle)):
                if i + j >= len(haystack):
                    return -1
                
                if haystack[i + j] != needle[j]: 
                    flag = False
                    break
            
            if flag:
                return i
            
            i += 1
        
        return -1
