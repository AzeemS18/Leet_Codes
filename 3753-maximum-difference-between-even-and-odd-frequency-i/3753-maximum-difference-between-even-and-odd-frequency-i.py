from collections import Counter
class Solution(object):
    def maxDifference(self, s):
        """
        :type s: str
        :rtype: int
        """
        x=Counter(s)
        even=[ i for i  in x.values() if (i % 2 )== 0]
        odd=[ i for i in x.values() if (i % 2 )!= 0]
        if not even or not odd:
            return -1
        min_even = min(even)
        max_odd=max(odd)
        return max_odd - min_even
        