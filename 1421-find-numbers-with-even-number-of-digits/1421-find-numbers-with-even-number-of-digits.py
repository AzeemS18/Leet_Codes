class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        x=len(nums)
        final_count=0
        count=0
        for i in range (x):
            a=nums[i]
            count=0
            while a>0:
                count=count+1
                a=a//10
            if count%2==0:
                final_count=final_count+1
        return final_count    
        