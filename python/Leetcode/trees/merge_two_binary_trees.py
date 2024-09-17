# https://leetcode.com/problems/merge-two-binary-trees/

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def mergeTrees(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> Optional[TreeNode]:
        def dfs(root1, root2):
            if not root1 and not root2:
                return None

            root, left1, left2, right1, right2 = None, None ,None, None, None
            if root1 and root2:
                root = TreeNode(root1.val + root2.val)
                left1 = root1.left
                right1 = root1.right
                left2 = root2.left
                right2 = root2.right
            elif root1:
                root = TreeNode(root1.val)
                left1 = root1.left
                right1 = root1.right
            else:
                root = TreeNode(root2.val)
                left2 = root2.left
                right2 = root2.right
            
            root.left = dfs(left1, left2)
            root.right = dfs(right1, right2)
            return root
        
        return dfs(root1, root2)