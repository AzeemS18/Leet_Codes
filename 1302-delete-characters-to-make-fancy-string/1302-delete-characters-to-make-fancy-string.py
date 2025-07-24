class Solution(object):
    def makeFancyString(self, s):
        """
        :type s: str
        :rtype: str
        """
        r=s[:2]
        for i in range (2,len(s)):
            if s[i] == r[-1] and s[i] == r[-2]:
                continue
            r+=s[i]
        return r
        