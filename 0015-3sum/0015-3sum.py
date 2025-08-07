class Solution(object):
    def threeSum(self, arr):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        arr.sort()
        res =[]
        n= len(arr)
        total = 0
        for i in range (n-2):
            if i > 0 and arr[i] == arr[i-1]:
                    continue
            left,right=i+1,n-1
            while left < right:
                total = arr[left] +arr[right] +arr[i]
                if total == 0:
                    res.append([arr[left],arr[i],arr[right]])
                    while left < right and arr[left] == arr[left+1]:
                        left+=1
                    while left < right and arr[right] == arr[right-1]:
                        right-=1
                    left+=1
                    right-=1
                elif  total < 0:
                    left+=1
                else:
                    right-=1
        return res



        