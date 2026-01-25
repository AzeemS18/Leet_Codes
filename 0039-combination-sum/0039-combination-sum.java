class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        if(candidates.length == 0 )return l;
        backtrack(candidates , 0 , new ArrayList<>(), target,l);
        return l;
    }
    static void backtrack(int[] can , int i , List<Integer>  path ,int target , List<List<Integer>> l ){
        if( target == 0 ){
            l.add(new ArrayList<>(path));
            return;
        }
        if( target < 0){
            return;
        }
        for(int j = i ; j < can.length ;  j++){
            path.add(can[j]);
            backtrack(can , j , path , target - can[j] , l );
            path.remove(path.size()-1);
        }
        
    }
}