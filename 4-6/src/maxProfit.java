/**
 * @date:2021-4-13, 16:31
 * @author:ShiShc
 */

public class maxProfit {
    public int f(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0;i < prices.length; i ++) {
            min = Math.min(prices[i], min);
            profit = Math.max(profit, prices[i] - min);
        }

        return profit;
    }
}
