/**
 * @date: 2021-5-3, 14:42
 * @author: ShiShc
 */

public class minCostClimbingStairs {
    public int f(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length + 3];
        for(int i = 2;i <= length+1;i ++) {
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i-2];
        }
        dp[length+2] = Math.min(dp[length+1], dp[length]);
        return dp[length+2];
    }

    public static void main(String[] args) {
        System.out.println(new minCostClimbingStairs().f(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println(new minCostClimbingStairs().f(new int[]{10,15,20}));
    }
}
