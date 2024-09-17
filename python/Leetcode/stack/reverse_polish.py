"""
https://leetcode.com/problems/evaluate-reverse-polish-notation/
"""

class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for x in tokens:
            if self.is_op(x):
                op2 = stack.pop()
                op1 = stack.pop()
                stack.append(self.exec_op(x, op1, op2))
            else:
                stack.append(int(x))
        
        return stack[0]
    

    def is_op(self, token):
        return token in ['+', '-', '*', '/']
    

    def exec_op(self, op, operand1, operand2):
        if op == '+':
            return operand1 + operand2
        if op == '-':
            return operand1 - operand2
        if op == '*':
            return operand1 * operand2
        return int(operand1 / operand2)