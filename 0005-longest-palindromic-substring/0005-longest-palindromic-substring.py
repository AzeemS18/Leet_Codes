class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        max_len=0
        x=[]
        longest=""
        for i in range (len(s)):
            for j in range (i,len(s)):
                x = s[i:j+1]
                if x == x [::-1]:
                    if len(x) > max_len:
                        max_len = len(x)
                        longest = x
        return longest
        