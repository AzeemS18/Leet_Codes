class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> l = new ArrayList<>();
        backtrack(s.toCharArray(),0,l);
        return l;
    }
    static void backtrack(char[] c , int i , List<String> s ){
        if( i == c.length ){
            s.add(new String(c));
            return;
        }
        if(Character.isLetter(c[i])){
            c[i] = Character.toLowerCase(c[i]);
            backtrack(c,i+1,s);
            c[i] = Character.toUpperCase(c[i]);
            backtrack(c,i+1,s);
        }else{
            backtrack(c,i+1,s);
        }
    }
}