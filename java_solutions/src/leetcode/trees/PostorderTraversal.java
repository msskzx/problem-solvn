package leetcode.trees;

import java.util.ArrayList;
import java.util.List;

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
class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList<Integer>());
    }

    List<Integer> dfs(TreeNode root, List<Integer> res) {
        if (root == null) {
            return res;
        }
        res = dfs(root.left, res);
        res = dfs(root.right, res);
        res.add(root.val);
        return res;
    }
    
}