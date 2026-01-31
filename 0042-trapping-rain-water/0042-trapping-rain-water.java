class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int w = 0;
        for(int r = 0 ; r < height.length ; r++){
            while( !st.isEmpty() && height[r] > height[st.peek()] ){
                int b = st.pop();
                if(st.isEmpty()) break;
                int l = st.peek();
                int wi = r - l - 1;
                int minw = Math.min(height[r],height[l]) - height[b];
                w += wi * minw;

            }
            st.push(r);
        }
        return w; 
        
    }
}