class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(candidates);
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
            if( j > i && can[j] == can[j-1])continue;
            path.add(can[j]);
            backtrack(can , j+1 , path , target - can[j] , l );
            path.remove(path.size()-1);
        }
        
    }
}