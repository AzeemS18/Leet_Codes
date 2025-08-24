class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        c=0
        for i in range (len(nums)):
            if nums[i] > nums[(i+1)%len(nums)]:
                c+=1
        if c<2:
            return True
        else:
            return False



        