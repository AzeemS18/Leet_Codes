class Solution {
    public String decodeString(String s) {
        Stack < Integer > n = new Stack();
        Stack < String > st = new Stack();
        int n1 = 0  ;
        String s1 = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                n1 = n1 * 10 + ( c - '0');
            }else if( c == '['){
                st.push(s1);
                n.push(n1);
                s1 = "";
                n1 = 0;
            }else if( c == ']'){
                String p = st.pop();
                int t = n.pop();
                for(int i = 0 ; i < t ; i++){
                    p += s1;
                }
                s1 = p;
            }else{
                s1 += c;
            }
        }
        return s1;
    }
}