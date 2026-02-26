class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2 ;
        while (i>=0 && nums[i] >= nums[i+1] ) i--;
        int j = nums.length - 1;
        if(i >= 0){
            while( nums[i] >= nums[j] ) j--;
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        reverse(nums,i+1);
    }
    private void reverse(int[] nums , int s){
        int e = nums.length - 1;
        while( s < e ){
            int t = nums[s];
            nums[s++] = nums[e];
            nums[e--] = t;
        }
    }
}