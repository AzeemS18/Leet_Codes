class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0 )return 0;
        int c = nums[0];
        int m = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            c = Math.max(nums[i],c+nums[i]);
            m = Math.max(c,m);
        }
        return m;
        
    }
}