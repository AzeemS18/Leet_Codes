class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fl = new ArrayList<>();
        if(numRows == 0) return fl;
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        fl.add(l1);
        if(numRows == 1) return fl;
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        fl.add(l2);
        if(numRows == 2) return fl;
        for(int i = 3 ; i <= numRows ; i++){
            List<Integer> l = new ArrayList<>();
            int n = 1;
            l.add(1);
            while(n < i-1){
                int a = fl.get(i-2).get(n-1);
                int b = fl.get(i-2).get(n);
                l.add(a+b);
                n++;
            }
            l.add(1);
            fl.add(l);
        }
        return fl; 
        
    }
}