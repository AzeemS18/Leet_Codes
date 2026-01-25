import java.util.*;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);

        int n = nums.length;
        int l = 0;
        int r = k - 1;
        int ans = Integer.MAX_VALUE;

        while (r < n) {
            ans = Math.min(ans, nums[r] - nums[l]);
            l++;
            r++;
        }

        return ans;
    }
}
