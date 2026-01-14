class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<>();
        int n = nums.length;
        if(n == 0){
            return l;
        }
        for(int i = 0 ; i < n ; i++){
            if(i+1 < n && nums[i] + 1 == nums[i+1]){
                String start = String.valueOf(nums[i]);
                String end = "" ;
                while(i+1 < n && nums[i]+1 == nums[i+1]){
                    end = String.valueOf(nums[i+1]);
                    i++;
                }
                l.add(start+"->"+end);
            }else{
                String start = String.valueOf(nums[i]);
                l.add(start);
            }
        }
        return l;
    }
}