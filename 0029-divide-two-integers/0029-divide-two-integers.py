import math
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1  # To handle overflow

        quotient = abs(dividend) // abs(divisor)
        # Handle sign
        if (dividend < 0) != (divisor < 0):
            quotient = -quotient

        return quotient