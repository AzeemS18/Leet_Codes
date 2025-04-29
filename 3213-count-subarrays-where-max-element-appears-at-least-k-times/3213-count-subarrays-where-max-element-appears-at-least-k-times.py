class Solution(object):
    def countSubarrays(self, nums, k):
        target = max(nums)
        count = 0
        result = 0
        left = 0
        n = len(nums)
        
        for right in range(n):
            if nums[right] == target:
                count += 1
            while count >= k:
                result += n - right
                if nums[left] == target:
                    count -= 1
                left += 1
        return result



class Solution(object):
    def countSubarrays(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        target = max(nums)
        final_count = 0
        x = len(nums)
        for i in range(x):
            count = 0
            for j in range(i, x):  # corrected range to include nums[x - 1]
                if nums[j] == target:
                    count += 1
                if count >= k:
                    final_count += 1
        return final_count

