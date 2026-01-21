class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l =new ArrayList<>();
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]){
                l.add(nums[i]);
            }
        }
        
        
        return l;
    }
}