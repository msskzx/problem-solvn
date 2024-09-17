package leetcode.trees;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return this.dfs(nums, 0, nums.length - 1);
    }

    TreeNode dfs(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int m = (int)(i + j) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = dfs(nums, i, m - 1);
        root.right = dfs(nums, m + 1, j);
        return root;
    }
}