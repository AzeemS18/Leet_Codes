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
