from collections import defaultdict

class Solution(object):
    def countBadPairs(self, nums):
        total_pairs = len(nums) * (len(nums) - 1) // 2
        freq = defaultdict(int)
        good_pairs = 0

        for i in range(len(nums)):
            key = i - nums[i]
            good_pairs += freq[key]
            freq[key] += 1

        return total_pairs - good_pairs
