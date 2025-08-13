class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        map1={}
        map2={}
        p=[]
        q=[]
        c=1
        for i in s:
            if i not in map1:
                map1[i] = str(c)
                c+=1
            p.append(map1[i])
        c=1
        for i in t:
            if i not in map2:
                map2[i] = str(c)
                c+=1
            q.append(map2[i])
        return p==q