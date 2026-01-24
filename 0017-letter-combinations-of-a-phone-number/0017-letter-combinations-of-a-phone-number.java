class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        List<String> l = new ArrayList<>();
        if(n==0)return l;
        String[] m ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,new StringBuilder(),l,m);
        return l; 
    }
    static void backtrack(String digits, int i , StringBuilder path,List<String>res,String[] map){
        if(i == digits.length()){
            res.add(path.toString());
            return;
        }
        String letter = map[digits.charAt(i) - '0'];
        for(int j = 0 ; j < letter.length() ; j++){
            path.append(letter.charAt(j));
            backtrack(digits,i+1,path,res,map);
            path.deleteCharAt(path.length()-1);
        }
    }
}