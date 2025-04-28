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






class Solution(object):
    def countSubarrays(self, nums, k):
        n = len(nums)
        count = 0
        for i in range(n):
            sum_ = 0
            for j in range(i, n):
                sum_ += nums[j]
                length = j - i + 1
                score = sum_ * length
                if score < k:
                    count += 1
        return count
