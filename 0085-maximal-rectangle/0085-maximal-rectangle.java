class Solution {
    public int maximalRectangle(char[][] m) {
        if( m.length == 0 ) return 0;
        int r = m.length;
        int c = m[0].length;
        int[] h = new int[c];
        int ma = 0;
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++){
                if( m[i][j] == '1' ){
                    h[j]++;
                }else{
                    h[j] = 0 ;
                }
            }
            ma = Math.max(ma,large(h));
        }
        return ma;
        
    }
    public int large(int[] h){
        Stack <Integer> s = new Stack<>();
        int n = h.length;
        int ma = 0;
        for(int i = 0 ; i <= h.length ; i++){
            int c = ( i == n ) ? 0 : h[i];
            while( !s.isEmpty() && c < h[s.peek()]){
                int he = h[s.pop()];
                int w = s.isEmpty() ? i : i - s.peek() - 1;
                ma = Math.max(ma , w * he );
            }
            s.push(i);
        }
        return ma;
    }
}