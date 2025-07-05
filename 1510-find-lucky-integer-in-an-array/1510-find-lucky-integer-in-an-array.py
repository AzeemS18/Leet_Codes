class Solution(object):
    def findLucky(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        from collections import Counter
        count=Counter(arr)
        result=-1
        for num in arr:
            if count[num] == num:
                result=max(result,num)
        return result
        