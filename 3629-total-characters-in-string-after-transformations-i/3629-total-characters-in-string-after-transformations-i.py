class Solution(object):
    def lengthAfterTransformations(self, s, t):
        mod = 10**9 + 7
        nums = [0]*26
        for ch in s:
            nums[ord(ch) - 97] += 1

        for _ in range(t):
            cur = [0]*26
            z = nums[25]
            if z:
                # 'z' → 'a' and 'b'
                cur[0] = (cur[0] + z) % mod
                cur[1] = (cur[1] + z) % mod
            for j in range(25):
                v = nums[j]
                if v:
                    cur[j+1] = (cur[j+1] + v) % mod
            nums = cur

        res = 0
        for v in nums:
            res = (res + v) % mod
        return res




class Solution(object):
    def lengthAfterTransformations(self, s, t):
        """
        :type s: str
        :type t: int
        :rtype: int
        """
        for _ in range(t):
            new_s = ""
            for char in s:
                if char == 'z':
                    new_s += "ab"
                else:
                    new_s += chr(ord(char) + 1)
            s = new_s  # update s for the next iteration
        return len(s)
