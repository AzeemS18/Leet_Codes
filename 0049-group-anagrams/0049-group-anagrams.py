from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        am={}
        for i in strs:
            key= "".join(sorted(i))
            if key not in am:
                am[key] = []
            am[key].append(i)
        return list(am.values())

        