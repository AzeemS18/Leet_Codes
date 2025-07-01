class Solution(object):
    def possibleStringCount(self, word):
        """
        :type word: str
        :rtype: int
        """
        i=0
        groups=[]
        while i < len(word):
            j=i
            while j < len(word) and word[i] == word[j]:
                j+=1
            groups.append((word[i],j-i))
            i=j
        total = 1
        for i , (char,length) in enumerate(groups):
            if length > 1 :
                total += (length - 1)
        return total