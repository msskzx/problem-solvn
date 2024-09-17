// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/

#include <vector>
using namespace std;

class Solution {
public:
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        vector<vector<int>> dp(matrix.size(), vector<int>(matrix[0].size(), 0));

        int mx = 0;
        for (int i = 0; i < matrix.size(); i ++) {
            for (int j = 0; j < matrix[0].size(); j++) {
                mx = max(mx, dfs(matrix, dp, i, j, -1));
            }
        }
        return mx;
    }

    int dfs(vector<vector<int>>& matrix, vector<vector<int>>& dp, int i, int j, int prev) {
        if (i < 0 || i >= matrix.size() || j < 0 || j >= matrix[0].size() || matrix[i][j] <= prev) {
            return 0;
        }

        if (dp[i][j] > 0) {
            return dp[i][j];
        }

        int res = 1;
        res = max(res, 1 + dfs(matrix, dp, i + 1, j, matrix[i][j]));        
        res = max(res, 1 + dfs(matrix, dp, i - 1, j, matrix[i][j]));        
        res = max(res, 1 + dfs(matrix, dp, i, j + 1, matrix[i][j]));        
        res = max(res, 1 + dfs(matrix, dp, i, j - 1, matrix[i][j]));      

        dp[i][j] = res;  

        return res;
    }
};