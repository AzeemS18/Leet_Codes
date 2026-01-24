class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        if(nums.length == 0 )return l;
        Arrays.sort(nums);
        backtrack( nums , new boolean[nums.length] , new ArrayList<>() , l );
        return l;
    }
    static void backtrack(int[] nums , boolean[] used , List<Integer> path , List<List<Integer>> l ){
        if(path.size() == nums.length){
            l.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(used[i]){
                continue;
            }
            if( i > 0 && nums[i]==nums[i-1] && !used[i-1])continue;
            used[i] = true;
            path.add(nums[i]);
            backtrack(nums,used,path,l);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}