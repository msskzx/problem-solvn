# https://leetcode.com/problems/valid-parenthesis-string/

class Solution:
    def checkValidString(self, s: str) -> bool:
        left = left_max = 0
        for c in s:
            if c == '(':
                left += 1
                left_max += 1
            elif c == ')':
                left -= 1
                left_max -= 1
            else:
                left -= 1
                left_max += 1
            
            if left_max < 0:
                return False
            if left < 0:
                left = 0
        
        return left == 0
        