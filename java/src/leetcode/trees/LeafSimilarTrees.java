package leetcode.trees;

import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/leaf-similar-trees/submissions/1385835484/

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

class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return this.dfs(root1, new LinkedList<>()).equals(this.dfs(root2, new LinkedList<>()));
    }

    List<Integer> dfs(TreeNode root, List<Integer> res) {
        if (root == null) {
            return res;
        }

        if (root.left == null && root.right == null) {
            res.add(root.val);
        }
        this.dfs(root.left, res);
        this.dfs(root.right, res);
        return res;
    }
}