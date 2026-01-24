class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        if(nums.length == 0 )return l;
        backtrack(nums , 0 , new ArrayList<>() , l);
        return l;
    }
    static void backtrack(int[] nums , int i , List<Integer> path , List<List<Integer>> l ){
        if(i == nums.length){
            l.add(new ArrayList<>(path));
            return;
        }
        backtrack(nums,i + 1 , path , l );
        path.add(nums[i]);
        backtrack(nums,i + 1 , path , l);
        path.remove(path.size() - 1 );
    } 
}