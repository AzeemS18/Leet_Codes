import java.util.*;
class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while(!q.isEmpty()){
            
            int c = q.poll();
            System.out.print(c);
            if( arr[c] == 0 ){
                return true;
            }
            if( arr[c] < 0 ){
                continue;
            }
            int f = c + arr[c];
            int b = c - arr[c];

            arr[c] = -arr[c];

            if( f < arr.length && arr[f] >= 0){
                q.add(f);
            }
            if( b >= 0 && arr[b] >= 0){
                q.add(b);
            }  
        }
        return false;

    }
}