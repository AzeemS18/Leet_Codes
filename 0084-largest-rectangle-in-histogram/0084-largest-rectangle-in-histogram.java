class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack< Integer > st = new Stack<>();
        int ma = 0 ;
        int n = heights.length;
        for(int i = 0 ; i <= n ; i++){
            int c = (i == n) ? 0 : heights[i];
            while( !st.isEmpty() && c < heights[st.peek()]){{
                int h = heights[st.pop()];
                int w;
                if(st.isEmpty()){
                    w = i;
                }else{
                    w = i - st.peek() -1;
                }
                ma =Math.max(ma,h*w);
            }

            }
            st.push(i);
        }
        return ma;
    }
}