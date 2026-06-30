class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp=new Integer[prices.length+1][2];
        return fun(prices,0,1,dp);
    }
    int fun(int[] prices,int i,int buy,Integer[][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][buy]!=null) return dp[i][buy];
        int profit=0;
        if(buy==1){
            int buyStock=-prices[i]+fun(prices,i+1,0,dp);
            int notBuy=fun(prices,i+1,1,dp);
            profit=Math.max(buyStock,notBuy);
        }
        else{
            int sellStock=prices[i]+fun(prices,i+2,1,dp);
            int notSell=fun(prices,i+1,0,dp);
            profit=Math.max(sellStock,notSell);
        }
        return dp[i][buy]=profit;
    }
}