package leetcode;

// https://leetcode.com/problems/arranging-coins/description/
class Solution {
    public int arrangeCoins(int n) {
        int lw = 0;
        int hi = 66000;
        int res = 0;
        while (lw <= hi) {
            int mid = (lw + hi) / 2;
            long sum = (long) mid * (mid + 1) / 2;
            if (sum == n) {
                return mid;
            }
            if (sum < n) {
                res = mid;
                lw = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return res;
        
    }
}