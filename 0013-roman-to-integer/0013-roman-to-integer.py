class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        x={ 'I':1 , 'V':5 , 'X':10 ,'L':50 ,'C':100 , 'D':500 , 'M':1000}
        t=0
        for i in range (len(s)):
            if i>0 and x[s[i]] > x[s[i-1]]:
                t += x[s[i]] - 2 * x[s[i-1]]
            else:
                t+=x[s[i]]
        return t
        