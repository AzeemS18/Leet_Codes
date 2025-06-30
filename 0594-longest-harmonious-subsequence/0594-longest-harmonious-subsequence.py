class Solution(object):
    def findLHS(self, nums):
        from collections import Counter
        count = Counter(nums)
        max_len = 0

        for key in count:
            if key + 1 in count:
                max_len = max(max_len, count[key] + count[key + 1])

        return max_len
