class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean a = true;
        for(int i = 1 ; i < nums.length ; i++){
            
            
            if(nums[i-1] < nums[i] || nums[i-1] == nums[i] ){
                continue;
            }else{
                a = false;
            }
        }
        boolean c = true;
        for(int i = 1 ; i < nums.length ; i++){
            
            if(nums[i-1] > nums[i] || nums[i-1] == nums[i]){
                continue;
            }else{
                c =  false;
            }
        }
        return a || c;
        
    }
}