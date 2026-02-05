class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2) return nums.length;
        int c = 1;
        int pd = 0;
        for(int i = 1 ; i < nums.length ; i++){
            int cd = nums[i] - nums[i - 1];
            if( pd <= 0 &&  cd > 0  || pd >= 0 && cd < 0 ){
                c++;
                pd = cd;
            }
        }
        return c;
    }
}