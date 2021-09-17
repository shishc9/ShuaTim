
/**
 * @date: 2021-5-3, 15:34
 * @author: ShiShc
 */

public class maxProfit {
    public int f(int[] prices, int fee) {
//        动态规划，中间有跳格就会出错了
//        int[] dp = new int[prices.length + 1];
//        int min = Integer.MAX_VALUE;
//        int temp, profit = 0;
//        for(int i = 1; i <= prices.length;i ++) {
//            min = Math.min(min, prices[i - 1]);
//            dp[i] = profit + ((temp = (prices[i-1] - min - fee)) > 0 ? temp : 0);
//            if(temp > 0) {
//                min = prices[i - 1];
//                profit = dp[i];
//            }
//        }
//
//        return dp[prices.length]
//        ;
        int length = prices.length;
        int buy = prices[0] + fee;
        int result = 0;
        for(int num : prices) {
            if(num + fee < buy) {
                buy = num + fee;
            } else if(num > buy) {
                result += num - buy;
                buy = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new maxProfit().f(new int[]{1,3,7,1,6,3}, 3));
    }
}
