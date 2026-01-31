class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        Stack <Integer> s = new Stack<>();
        int[] r = new int[n];
        for(int i = n - 1 ; i >= 0 ; i--){
            while( !s.isEmpty() && t[s.peek()] <= t[i] ){
                s.pop();
            }
            r[i] = s.isEmpty() ? 0 : s.peek() - i;
            s.push(i);
        }
        return r;
        
    }
}