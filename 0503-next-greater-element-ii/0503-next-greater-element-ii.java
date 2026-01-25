class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        for(int i = 2 * n - 1 ; i >= 0 ; i--){
            int in = i % n; //wrapping condition if n = 4 -> i = 7 -> in -> 3 nums[3]
            while( !s.isEmpty() && s.peek() <= nums[in]){
                s.pop();
            }
            if(i<n){
                res[in] = s.isEmpty() ? -1 : s.peek();
            }
            s.push(nums[in]); 
        }
        return res;
        
    }
}