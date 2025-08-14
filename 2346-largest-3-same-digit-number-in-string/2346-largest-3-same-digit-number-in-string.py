class Solution(object):
    def largestGoodInteger(self, num):
        """
        :type num: str
        :rtype: str
        """
        largest=""
        c=""
        for i in range (len(num)-2):
            if num[i] == num[i+1] == num[i+2]:
                c = num[i:i+3]
                if c > largest:
                    largest = c
        return largest
        
        