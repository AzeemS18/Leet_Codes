class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1 ) return nums[0]; 
        Arrays.sort(nums);
        int i = 0 ;
        for(i = 0 ; i < nums.length - 1 ; i += 2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[i];
    }
}