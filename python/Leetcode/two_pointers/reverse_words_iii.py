# https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution:
    def reverseWords(self, s: str) -> str:
        a = [c for c in s]
        i = 0
        j = 0
        for c in a:
            if c == ' ' or j == len(a) - 1:
                # swap
                k = j
                if c == ' ':
                    k -= 1
                while i < k:
                    a[i],a[k] = a[k], a[i]
                    i += 1
                    k -= 1
                i = j + 1
            j += 1
        return "".join(a)