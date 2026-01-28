class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int fc = prices[0];
        int sc = prices[1];
        if(money >= fc + sc){
            money = money- fc - sc;
            return money;
        }
        return money;
        
    }
}