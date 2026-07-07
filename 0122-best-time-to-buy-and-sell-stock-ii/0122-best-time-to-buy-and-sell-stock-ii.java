class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp=new Integer[prices.length+1][2];
        return fun(prices,1,0,dp);
    }
    int fun(int[] prices,int buy,int i,Integer[][] dp){
        if(i==prices.length) return 0;
        if(dp[i][buy]!=null) return dp[i][buy];
        int profit=0;
        if(buy==1){
            int buystock=-prices[i]+fun(prices,0,i+1,dp);
            int notbuy=fun(prices,1,i+1,dp);
            profit=Math.max(buystock,notbuy);
        }
        else{
            int sell=prices[i]+fun(prices,1,i+1,dp);
            int notsell=fun(prices,0,i+1,dp);
            profit=Math.max(sell,notsell);
        }
        return dp[i][buy]=profit;
    }
}