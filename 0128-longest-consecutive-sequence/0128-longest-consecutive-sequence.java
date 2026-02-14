class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums) s.add(i);
        int max = 0;
        for(int n : s){
            if(! s.contains(n - 1)){
                int curr = n;
                int c = 1;
                while(s.contains( curr + 1 )){
                    curr++;
                    c++;
                }
                max = Math.max( c , max);
            }
            
        }
        return max;
        
    }
}