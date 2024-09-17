"""
https://leetcode.com/problems/binary-tree-level-order-traversal/
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        q = deque()
        q.append(root)
        res = []
        while q:
            t = deque()
            cur = []
            while q:
                node = q.popleft()
                if node:
                    cur.append(node.val)
                    t.append(node.left)
                    t.append(node.right)
            q = t
            if cur:
                res.append(cur)
        return res
        