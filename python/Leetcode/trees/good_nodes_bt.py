"""
https://leetcode.com/problems/count-good-nodes-in-binary-tree/
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        if not root:
            return 0
        def dfs(root, mx):
            if not root:
                return 0
            
            res = 0
            if root.val >= mx:
                res = 1

            mx = max(root.val, mx)
            return res + dfs(root.left, mx) + dfs(root.right, mx)

        return dfs(root, root.val)            