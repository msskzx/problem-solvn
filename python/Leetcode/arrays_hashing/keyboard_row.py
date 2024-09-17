"""
https://leetcode.com/problems/keyboard-row/
"""

class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        rows = [
            'qwertyuiop',
            'asdfghjkl',
            'zxcvbnm'
        ]
        res = []
        for word in words:
            w = word.lower()
            flag = False
            for row in rows:            
                flag = all(c in row for c in w)
                if flag:
                    res.append(word)
                    break
        
        return res