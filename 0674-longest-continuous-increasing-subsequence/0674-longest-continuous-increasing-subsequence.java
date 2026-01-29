class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c = 1 ;
        int m = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){
                c++;
                m =Math.max(c,m);
            }else{
                c=1;
            }
        }
        return m;
    }
}