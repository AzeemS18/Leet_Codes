class Solution(object):
    def countSubarrays(self, nums, k):
        n = len(nums)
        count = 0
        sum_ = 0
        left = 0
        for right in range(n):
            sum_ += nums[right]
            while sum_ * (right - left + 1) >= k:
                sum_ -= nums[left]
                left += 1
            count += (right - left + 1)
        return count
