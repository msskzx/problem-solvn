// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

#include <set>
#include <vector>
using namespace std;

class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int i = 0;
        int j = k - 1;
        int mn = INT_MAX;
        while (j < nums.size()) {
            mn = min(mn, nums[j] - nums[i]);
            i++;
            j++;
        }
        return mn;
    }
};