"""
https://leetcode.com/problems/car-fleet/submissions/1237398713/
"""

class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        pos_spd = []
        for i in range(len(position)):
            pos_spd.append([position[i], speed[i]])
        
        pos_spd.sort(key=lambda i: i[0])
        stack = [(target - pos_spd[-1][0]) / pos_spd[-1][1]]

        for i in range(len(pos_spd)-2, -1, -1):
            cur_t = (target - pos_spd[i][0]) / pos_spd[i][1]
            if cur_t > stack[-1]:
                stack.append(cur_t)
        
        return len(stack)
        
