class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> s = new Stack<>();
        int n = heights.length;
        int maxarea = 0 ;
        for(int i = 0 ; i <= n ; i++){
            int h = (i==n)?0:heights[i];
            while(!s.isEmpty() && h < heights[s.peek()]){
                int top = heights[s.pop()];
                int w = s.isEmpty()?i:i-s.peek()-1;
                maxarea = Math.max(maxarea,top*w);
            }
            s.push(i);
        }
        return maxarea;
    }
}