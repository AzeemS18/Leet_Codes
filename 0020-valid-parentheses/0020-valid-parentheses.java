class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char i : c){
            if(i == '(' || i == '{' || i == '['){
                st.push(i);
            }else{
                if(st.isEmpty())return false;
                char x = st.pop();
                
                if( i == ')' && x != '('){
                    return false;
                }else if ( i == '}' && x != '{'){
                    return false;
                }else if ( i == ']' && x != '['){
                    return false;
                }
            }
        }
        return true ? st.isEmpty() : false;  
        
    }
}