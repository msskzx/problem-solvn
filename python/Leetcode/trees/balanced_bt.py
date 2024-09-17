"""
https://leetcode.com/problems/balanced-binary-tree/
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        return self.height(root)[0]
        
    def height(self, root):
        if not root:
            return [True, 0]
        
        left = self.height(root.left)
        right = self.height(root.right)
        h = 1 + max(left[1], right[1])
        if abs(left[1] - right[1]) > 1:
            return [False, h]
        
        return [left[0] and right[0], h]
        

        