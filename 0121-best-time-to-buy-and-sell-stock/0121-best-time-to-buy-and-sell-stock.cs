public class Solution {
    public int MaxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.Length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}