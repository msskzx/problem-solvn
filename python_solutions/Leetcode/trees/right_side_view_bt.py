"""
https://leetcode.com/problems/binary-tree-right-side-view/
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        q = deque([root])
        res = []
        while q:
            n = len(q)
            for i in range(n):
                x = q.popleft()
                if i == 0:
                    res.append(x.val)
                if x.right:
                    q.append(x.right)
                if x.left:
                    q.append(x.left)
        return res