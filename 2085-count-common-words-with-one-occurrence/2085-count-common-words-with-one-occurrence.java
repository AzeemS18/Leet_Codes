class Solution {
    public int countWords(String[] w1, String[] w2) {
        HashMap<String,Integer> m1 = new HashMap<>();
        HashMap<String,Integer> m2 = new HashMap<>();
        int res = 0;
        int n1 = w1.length;
        int n2 = w2.length;
        for(int i = 0 ; i < n1 ; i++){
            int c = m1.getOrDefault(w1[i],0);
            m1.put( w1[i] , c + 1 );
        }
        for(int i = 0 ; i < n2 ; i++){
            int c = m2.getOrDefault(w2[i],0);
            m2.put( w2[i] , c + 1 );
        }
        for(String word : m1.keySet()){
        if(m1.get(word) == 1 && m2.getOrDefault(word,0) == 1){
            res++;
        }
}
        return res;
        
    }
}