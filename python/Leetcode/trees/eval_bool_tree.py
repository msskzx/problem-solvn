# https://leetcode.com/problems/evaluate-boolean-binary-tree/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return False

        if not root.right and not root.left:
            return root.val == 1
        
        if root.val == 2:
            return self.evaluateTree(root.left) or self.evaluateTree(root.right)

        return self.evaluateTree(root.left) and self.evaluateTree(root.right)
 