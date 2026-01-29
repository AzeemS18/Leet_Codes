class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int n = nums.length - 1;
        int b = nums[n];
        int ans = 0;
        while( a < n ){
            ans = Math.max(ans,nums[a]+nums[n]);
            a++;
            n--;
        }
        return ans;
        
    }
}