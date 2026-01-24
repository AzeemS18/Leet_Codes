class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0 ; 
        int r = 0 ;
        double res = Integer.MIN_VALUE;
        double sum = 0;
        while( r < n){
            sum += nums[r];
            if( r-l+1 == k ){
                double sum1 = sum / k;
                res = Math.max(sum1,res);
                sum -= nums[l];
                l++;
            }
            r++;

        }
        return res;
        
    }
}