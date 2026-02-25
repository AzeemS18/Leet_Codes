class Solution {
    public int majorityElement(int[] nums) {
        int me = 0 ;
        int c = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(c == 0){
                me = nums[i];
                c = 1 ;
            }else if ( me == nums[i]){
                c++;
            }else{
                c--;
            }
        }
        int c1 = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == me){
                c1++;
            }
        }
        if( c1 >= nums.length / 2){
            return me;
        }  
        return -1;
    }
}