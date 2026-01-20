class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int ad = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.length ; i++){
            ad = Math.min(ad, Math.abs(arr[i] - arr[i-1]) );
        }
        List<List<Integer>> fl = new ArrayList<>();
        for(int i = 1 ; i < arr.length ; i++){
            List<Integer> l = new ArrayList<>();
            if( Math.abs(arr[i] - arr[i-1]) == ad ){
                l.add(arr[i-1]);
                l.add(arr[i]);
                fl.add(l);    
            }
            
        }
        return fl;
        
    }
}