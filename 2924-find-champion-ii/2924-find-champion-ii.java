class Solution {
    public int findChampion(int n, int[][] edges) {
        int x = edges.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i < x ; i++){
            int a = edges[i][1];
            s.add(a);
        }
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(! s.contains(i)){
                l.add(i);
            }
        }
        int res = -1;
        if( l.size() == 1){
            res = l.get(0) ;
            return res;
        }

        return res;
    }
}