"""
https://leetcode.com/problems/daily-temperatures/?source=submission-ac
"""

class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        stack = []
        
        for i, t in enumerate(temperatures):
            while stack and t > stack[-1][1]:
                idx, val = stack.pop()
                res[idx] = i - idx
            stack.append([i, t])
        return res
            

class SolutionTwo:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = [0] * len(temperatures)
        lookup = {}
        
        for i in range(len(temperatures)-1, -1, -1):
            count = 0
            min_count = 10**6
            x = temperatures[i]
            for y in range(x+1, 101):
                if y in lookup:
                    count = lookup[y] - i
                    min_count = min(count, min_count)
            lookup[x] = i
            min_count = min(count, min_count)
            res[i] = min_count
        return res
        