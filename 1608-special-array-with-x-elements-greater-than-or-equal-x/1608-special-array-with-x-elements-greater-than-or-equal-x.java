class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i <= n ; i++){
            int c = 0 ;
            for(int j = 0 ; j < n ; j++ ){
                if( nums[j] >= i ){
                    c++;
                }
            }
            if(c==i){
                return c;
            }
        }
        return -1;
    }
}