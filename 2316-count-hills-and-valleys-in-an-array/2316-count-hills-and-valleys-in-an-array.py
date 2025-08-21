class Solution(object):
    def countHillValley(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        arr=[nums[0]]
        for i in range (len(nums)):
            if nums[i] !=nums[i-1]:
                arr.append(nums[i])
        for i in range (1,len(arr)-1):
            if arr[i] > arr[i-1] and arr[i] >arr[i+1] :
                c+=1
            elif arr[i] < arr[i-1] and arr[i] < arr[i+1]:
                c+=1
        return c