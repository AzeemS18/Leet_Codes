class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 0;
        if(nums.length <= 3 )return false;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){
                p++;
            }else{
                break;
            }
        }
        if(p==0 || p == nums.length - 1)return false;
        int q = 0;
        for(int i = p+1 ; i < nums.length ; i++){
            if(nums[i-1] > nums[i]){
                q++;
            }else{
                break;
            }
        }
        if( q == 0 || p+q == nums.length - 1)return false;
        int r = 0;
        for(int i = p+q+1 ; i < nums.length ; i++){
            if(nums[i-1] < nums[i]){
                r++;
            }else{
                break;
            }
        }
        if(p+q+r == nums.length - 1)return true;
        return false;
    }
}