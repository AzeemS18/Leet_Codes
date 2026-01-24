class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<>();
        if( n == 0 ) return l;
        backtrack( n , k , 1 , new ArrayList<>() , l);
        return l;
    }
    static void backtrack( int n , int k , int start  , List<Integer> path , List<List<Integer>> l  ){
        if( path.size() == k ){
            l.add(new ArrayList<>(path) );
            return;
        }
        for(int i = start ; i <= n ; i++){
            path.add(i);
            backtrack(n,k, i + 1  ,path , l);
            path.remove(path.size() - 1);
        }
        
    }
}