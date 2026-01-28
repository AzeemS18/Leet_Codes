class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0)return 0;
        int c = nums[0];
        int m = nums[0];
        int i = 1 ;
        while(i<nums.length){
            c = Math.max(nums[i],nums[i]+c);
            m = Math.max(m,c);
            i++;
        }
        return m;
        
    }
}