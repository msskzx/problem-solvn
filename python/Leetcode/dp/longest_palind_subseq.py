# https://leetcode.com/problems/longest-palindromic-subsequence/
  
class Solution:
    def longestPalindromeSubseq(self, s: str) -> int:
        r = s[::-1]
        N = len(s)
        dp = [[0] * (N + 1) for _ in range(N + 1)]
        for i in range(N - 1, -1, -1):
            for j in range(N - 1, -1, -1):
                if s[i] == r[j]:
                    dp[i][j] = 1 + dp[i + 1][j + 1]
                else:
                    dp[i][j] = max(dp[i + 1][j], dp[i][j + 1])
        return dp[0][0]