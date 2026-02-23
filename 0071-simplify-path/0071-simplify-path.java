class Solution {
    public String simplifyPath(String path) {
        String[] sp = path.split("/+");
        Stack<String> st = new Stack<>();
        for(String s : sp){
            if(s.equals("") || s.equals(".") ){
                continue;
            }else if( s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }   
            }else{
                st.push(s);
            }
        }
        
        if(st.isEmpty())return new String("/");
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,"/"+st.pop());
        }
        return sb.toString();
        
        
    }
}