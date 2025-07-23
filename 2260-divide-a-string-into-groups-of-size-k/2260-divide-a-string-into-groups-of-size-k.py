class Solution(object):
    def divideString(self, s, k, fill):
        """
        :type s: str
        :type k: int
        :type fill: str
        :rtype: List[str]
        """
        x=[]
        for i in range (0,len(s),k):
            chunk=s[i:i+k]
            if len(chunk) < k:
                chunk += fill * (k-(len(chunk)))
            x.append(chunk)
        return x
            
        