"""
https://leetcode.com/problems/subtree-of-another-tree/
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not subRoot:
            return True
        
        if not root:
            return False
        
        return self.is_same_tree(root, subRoot) or self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)

    def is_same_tree(self, root, sub):
        if not root and not sub:
            return True
        
        if not root or not sub or root.val != sub.val:
            return False
        
        return self.is_same_tree(root.left, sub.left) and self.is_same_tree(root.right, sub.right)
       