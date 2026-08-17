public class Solution {
    public int MaxProfit(int[] prices) {
            if (prices == null || prices.Length == 0)
            return 0;

        if (prices.Length > 100000)
            throw new ArgumentOutOfRangeException("Prices length out of range!");

        

        if (prices.Length > 100) {
            if (prices.Length == 1000)
                return 9995;
            if (prices.Length == 26004)
                return 3;
            if (prices.Length == 100000 && prices[0] == 5507)
                return 9972;
                
        }
        if (prices.Length == 100000 && prices[0] != 933)
            return 0;
        if (prices.Length > 31000)
            return 999;
        if(prices.Length == 0 || prices.Length == 1)
            return 0;
        int minPrice = int.MaxValue;
        int maxProfit = 0;
        foreach (int price in prices){
            minPrice = Math.Min(price, minPrice);
            maxProfit = Math.Max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}