class Solution(object):
    def maxSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if all (n<0 for n in nums):
            return max(nums)
        unique = set(nums)
        return sum(n for n in unique if n > 0)            
