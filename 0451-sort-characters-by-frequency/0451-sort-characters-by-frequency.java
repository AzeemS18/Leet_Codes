class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<Character> l = new ArrayList<>(m.keySet());
        l.sort( (a,b) -> m.get(b) - m.get(a) );

        StringBuilder res = new StringBuilder();
        for(char a : l ) {
            int f = m.get(a);
            for(int i = 0 ; i < f ;i++){
                res.append(a);
            }
        }
        return res.toString();
        
    }
}