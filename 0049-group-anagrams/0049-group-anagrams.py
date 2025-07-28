from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        x=defaultdict(list)
        for i in strs:
            s=tuple(sorted(i))
            x[s].append(i)
        return (list(x.values()))

        