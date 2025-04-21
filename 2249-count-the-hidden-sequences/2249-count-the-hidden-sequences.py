class Solution(object):
    def numberOfArrays(self, differences, lower, upper):
        """
        :type differences: List[int]
        :type lower: int
        :type upper: int
        :rtype: int
        """
        curr = 0
        min_sum = 0
        max_sum = 0

        for diff in differences:
            curr += diff
            min_sum = min(min_sum, curr)
            max_sum = max(max_sum, curr)

        min_start = lower - min_sum
        max_start = upper - max_sum

        return max(0, max_start - min_start + 1)
