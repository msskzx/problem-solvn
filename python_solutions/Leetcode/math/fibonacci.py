"""
https://leetcode.com/problems/fibonacci-number/
"""

class Solution:
    def fib(self, n: int) -> int:
        if n < 2:
            return n
        dp = [0, 1]
        
        def fibi(i):
            if i == n + 1:
                return
            dp[0], dp[1] = dp[1], sum(dp)
            fibi(i+1)
        
        fibi(2)
        return dp[1]
