class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        x=[]
        for i in range (len(nums)):
            if nums[i]==target:
                x.append(i)
                break
        else:
                x.append(-1)
        for i in range (len(nums)-1,-1,-1):
            if nums[i]==target:
                x.append(i)
                break
        else:
                x.append(-1)
        return x
        

        