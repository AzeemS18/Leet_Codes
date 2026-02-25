class Solution {
    public List<List<String>> partition(String s) {
        List <String> l = new ArrayList<>();
        List<List<String>> r = new ArrayList<>();
        backtrack(s,0,l,r); 
        return r;
    }
    private void backtrack(String s ,int start ,List <String> l , List<List<String>> r ){
        if( start == s.length() ){
            r.add( new ArrayList<>(l));
        }
        for(int i = start ; i < s.length() ; i++){
            if(ispal(s,start,i)){
                l.add(s.substring(start,i+1));
                backtrack(s,i+1,l,r);
                l.remove( l.size() - 1 );
            }
        }
    }
    private boolean ispal(String s , int st , int en ){
        while( st <= en ){
            if(s.charAt(st) != s.charAt(en)){
                return false;
            }
            st++;
            en--;
        }
        return true;
    }
}