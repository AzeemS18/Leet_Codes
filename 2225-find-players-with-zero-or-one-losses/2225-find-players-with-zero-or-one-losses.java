class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> s = new HashSet<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        int n = matches.length;
        for(int i = 0 ; i < n  ; i++){
            int x = matches[i][1];
            m.put( x , m.getOrDefault(x,0)+1);
            int y = matches[i][0];
            s.add(y);
        }
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        for(int i : m.keySet()){
            if( m.get(i) == 1  ){
                res1.add(i);
            }
        }
        for(int i : s){
            if(!m.containsKey(i)){
                res2.add(i);
            }
        }
        List<List<Integer>> f = new ArrayList<>();
        Collections.sort(res1);
        Collections.sort(res2);
        f.add(res2);
        f.add(res1);
        return f;

        
    }
}