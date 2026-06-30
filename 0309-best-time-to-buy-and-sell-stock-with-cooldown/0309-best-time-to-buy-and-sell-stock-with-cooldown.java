class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp=new Integer[prices.length+1][2];
        return fun(0,1,prices,dp);
    }
    int fun(int i,int buy,int[] prices,Integer[][] dp){
        if(i>=prices.length) return 0;
        if(dp[i][buy]!=null) return dp[i][buy];
        int profit=0;
        if(buy==1){
            int buystock=-prices[i]+fun(i+1,0,prices,dp);
            int skip=fun(i+1,1,prices,dp);
            profit=Math.max(buystock,skip);
        }
        else{
            int sell=prices[i]+fun(i+2,1,prices,dp);
            int hold=fun(i+1,0,prices,dp);
            profit=Math.max(sell,hold);
        }
        return dp[i][buy]=profit;
    }
}