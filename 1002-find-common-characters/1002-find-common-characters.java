class Solution {
    public List<String> commonChars(String[] words) {
        int[] f1 = new int[26];
        Arrays.fill(f1,Integer.MAX_VALUE);
        for(String s : words){
            int[] f = new int[26];
            int n = s.length();
            for(int i = 0 ; i < n ; i++ ){
                f[s.charAt(i) - 'a']++;
            }
            for(int i = 0 ; i < 26 ; i++ ){
                int cc = f[i];
                f1[i] = Math.min(cc,f1[i]);
            }
        }
        List<String> l = new ArrayList<>();
        for(int i = 0 ; i < 26 ; i++){
            int c = f1[i];
            while( c > 0){
                l.add(String.valueOf( (char) ('a' + i) ));
                c--;
            }
        }
        return l;
        
    }
}