"""
https://leetcode.com/problems/clone-graph/submissions/1318685453/
"""

"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        old_new = {}

        def dfs(node):
            if node in old_new:
                return old_new[node]
            
            copy = Node(node.val)
            old_new[node] = copy
            for neighbor in node.neighbors:
                copy.neighbors.append(dfs(neighbor))

            return copy
        
        return dfs(node) if node else None
        