# https://leetcode.com/problems/binary-tree-preorder-traversal/
#  
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        def dfs(root, res):
            if not root:
                return res

            res.append(root.val)
            res = dfs(root.left, res)
            res = dfs(root.right, res)
            return res

        return dfs(root, [])
            
            
        