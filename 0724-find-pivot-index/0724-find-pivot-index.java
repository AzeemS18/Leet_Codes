class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int res = -1;
        for(int i = 0 ; i < n ; i++){
            int ls = 0 ;
            int rs = 0 ;
            for(int j = 0 ; j < i ; j++){
                ls+=nums[j];
            }
            for(int j = i+1 ; j < n ; j++){
                rs+=nums[j];
            }
            if(ls==rs){
                res = i;
                return res;
            }
        }
        return res;
        
    }
}