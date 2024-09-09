package leetcode.binarysearch;

// https://leetcode.com/problems/squares-of-a-sorted-array/

class SquaresSorted {
    public int[] sortedSquares(int[] nums) {
        int lw = 0;
        int hi = nums.length - 1;
        int[] res = new int[nums.length];
        int i = hi;
        while (lw <= hi) {
            if (nums[lw] * nums[lw] > nums[hi] * nums[hi]) {
                res[i] = nums[lw] * nums[lw];
                lw++;
            } else {
                res[i] = nums[hi] * nums[hi];
                hi--;
            }
            i--;
        }
        return res;
    }
}