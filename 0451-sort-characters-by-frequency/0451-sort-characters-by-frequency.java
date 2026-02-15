class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> q = new PriorityQueue<>( (a,b) -> m.get(b) - m.get(a) );
        q.addAll(m.keySet());

        String res = "";
        while( !q.isEmpty() ){
            char a = q.poll();
            int f = m.get(a);
            for(int i = 0 ; i < f ;i++){
                res += a;
            }
        }
        return res;
        
    }
}