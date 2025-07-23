class Solution(object):
    def maxAdjacentDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_diff=float("-inf")
        for i in range (len(nums)):
            x= nums[i]  
            y=nums[(i+1)%len(nums)]
            a=max(x,y)
            b=min(x,y)
            diff = a-b
            if diff > max_diff:
                max_diff = diff
        return max_diff if max_diff !=float("-inf") else -1
        