class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0 , new ArrayList<>() , l);
        return l;
    }
    static void backtrack(int[] n ,int  idx , List<Integer>path , List<List<Integer>> l){
        l.add(new ArrayList<>(path));
        for(int i = idx ; i < n.length ; i++){
            if( i > idx && n[i] == n[i-1] ) continue;
            path.add(n[i]);
            backtrack( n , i+1 , path , l);
            path.remove(path.size()-1);
        }
    }
}