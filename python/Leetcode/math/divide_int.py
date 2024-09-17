"""
https://leetcode.com/problems/divide-two-integers/description/
"""
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        negative = (dividend < 0) != (divisor < 0)
        dividend = abs(dividend)
        divisor = abs(divisor)

        quotient = 0
        temp = divisor
        multiple = 1

        while dividend >= (temp << 1):
            temp <<= 1
            multiple <<= 1

        while dividend >= divisor:
            if dividend >= temp:
                dividend -= temp
                quotient += multiple
            temp >>= 1
            multiple >>= 1

        quotient = -quotient if negative else quotient
        if quotient < -2**31:
            return -2**31

        if quotient > 2**31-1:
            return 2**31-1

        return quotient
        