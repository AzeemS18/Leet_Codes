class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0 ;
        int r = nums.length - 1;
        int[] res = new int[nums.length];
        int n = nums.length - 1;
        while( l <= r){
            int a = nums[l] * nums[l];
            int b = nums[r] * nums[r];
            if( a > b ){
                res[n] = a;
                l++;
            }else{
                res[n] = b;
                r--;
            }
            n--;
        }
        return res;
        
    }
}