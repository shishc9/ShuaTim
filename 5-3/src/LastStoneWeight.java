/**
 * @date: 2021-5-12, 09:48
 * @author: ShiShc
 */

public class LastStoneWeight {
    public int f(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }

        int target = sum / 2;
        int[][] dp = new int[stones.length][target + 1];
        for(int j = target;j >= stones[0];j --) {
            dp[0][j] = dp[0][j - stones[0]] + stones[0];
        }

        for(int i = 1;i < stones.length;i ++) {
            for(int j = 0;j < target + 1;j ++) {
                if(stones[i] > j) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - stones[i]] + stones[i]);
                }
            }
        }

        return sum - 2 * dp[stones.length - 1][target];
    }


    public static void main(String[] args) {
        System.out.println(new LastStoneWeight().f(new int[]{2, 7, 4, 1, 8, 1}));
    }
}
