class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        if n < 2:
            return s
        st = 0 
        en = 0
        def expand ( s , start , end ):
            while ( start >= 0 and end < len(s)) and s[start] == s[end]:
                start = start - 1
                end = end + 1

            return end - start - 1
        for i in range (n):
            ol = expand(s,i,i)
            el = expand(s,i,i+1)
            x = max(ol , el)

            if x > en - st + 1 :
                st = i - ( (x-1) // 2 )
                en = i +  ( x // 2 )
        return s[st : en + 1]












