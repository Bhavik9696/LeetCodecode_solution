class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
       int max_profit=0;
       int buy_price=prices[0];
       for(int i=1;i<n;i++){
        int cur_price=prices[i]-buy_price;
        if(cur_price>max_profit){
            max_profit=cur_price;
        }
        if(prices[i]<buy_price){
            buy_price=prices[i];
        }
       }
       return max_profit;
    }
    
}