class Solution {
    public int calPoints(String[] o ) {
        Stack < Integer > s = new Stack<>();
        for(String x : o){
            if(x.equals("+")){
                int i = s.pop();
                int j = s.peek();
                s.push(i);
                s.push(i+j);
            }else if (x.equals("D")){
                s.push(s.peek()*2);
            }else if(x.equals("C")){
                s.pop();
            }else{
                s.push(Integer.valueOf(x));
            } 
        }
        int sum = 0 ;
        for(int i : s){
            sum += i;
        }
        return sum;
        
    }
}