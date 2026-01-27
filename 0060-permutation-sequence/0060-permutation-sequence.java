class Solution {
    public String getPermutation(int n, int k) {
        int[] f = new int[n+1];
        f[0] = 1;
        List<Integer> l = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            f[i] = i*f[i-1];
            l.add(i);
        }
        k--;
        StringBuilder sb = new StringBuilder();
        for(int i = n ; i > 0 ; i--){
            int index = k / f[i-1];
            sb.append(l.get(index));
            l.remove(index);
            k = k % f[i-1];
        }
        return sb.toString();
        
    }
}