class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int n = intervals.length;
        int[][] res = new int[n][2];
        int ls = intervals[0][0];
        int le = intervals[0][1];
        int x = 0;
        for(int i = 0 ; i < n -1  ; i++ ){
            int s = intervals[i+1][0];
            int e = intervals[i+1][1];
            if(s <= le ){
                le = Math.max(le,e);
            }else{
                res[x][0] = ls;
                res[x][1] = le;
                ls = s;
                le = e;
                x++;
            }
        }
        res[x][0] = ls;
        res[x][1] = le;
        int[][] res1 = new int[x+1][2];
        for(int i = 0 ; i <= x ; i++){
            res1[i][0] = res[i][0];
            res1[i][1] = res[i][1];
        }
        return res1;
    }
}