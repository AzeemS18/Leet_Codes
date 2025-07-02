class Solution(object):
    def longestMonotonicSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        x=1
        y=1
        z=1
        for i in range (len(nums)-1):
            if nums[i] < nums[i+1]:
                x+=1
                y=1
            elif nums[i] > nums[i+1]:
                y+=1
                x=1
            else:
                x=1
                y=1
            z=max(x,y,z)   
        return z
        
        