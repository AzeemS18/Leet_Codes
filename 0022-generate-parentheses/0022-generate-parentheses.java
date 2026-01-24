class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        if(n==0)return res;
        backtrack(n,0,0,new StringBuilder(),res);
        return res;  
    }
    static void backtrack(int n , int open , int close , StringBuilder path , List<String> res){
        if(path.length() == n * 2){
            res.add(path.toString());
            return;
        }
        if(open<n){
            path.append('(');
            backtrack(n,open +1,close,path, res);
            path.deleteCharAt(path.length() -1 );
        }
        if( close < open ){
            path.append(')');
            backtrack(n, open,close+1,path,res);
            path.deleteCharAt(path.length() - 1 );
        }
    }
}