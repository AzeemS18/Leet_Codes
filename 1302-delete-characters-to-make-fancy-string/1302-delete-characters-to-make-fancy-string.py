class Solution(object):
    def makeFancyString(self, s):
        """
        :type s: str
        :rtype: str
        """
        c=0
        b=s[0]
        for i in range (1,len(s)):
            if s[i] == s[i-1]:
                c+=1
            else:
                c=0
            if c < 2:
                    b+=s[i]
        return b
        