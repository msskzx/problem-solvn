"""
https://leetcode.com/problems/word-break/submissions/1259341724/
"""

class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        dp = [False] * (len(s) + 1)
        dp[-1] = True

        for i in range(len(s) - 1, -1, -1):
            for x in wordDict:
                if s[i: i + len(x)] == x:
                    dp[i] |= dp[i + len(x)]
        return dp[0]