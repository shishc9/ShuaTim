import java.util.Arrays;

/**
 * @date: 2021-5-12, 09:20
 * @author: ShiShc
 */

public class DP {
    public static void main(String[] args) {
        int bagWeight = 4;
        int[] weight = new int[]{1,3,4};
        int[] value = new int[]{15,20,30};

        int[][] dp = new int[weight.length][bagWeight + 1];
        for(int j = bagWeight; j >= weight[0]; j--) {
            dp[0][j] = dp[0][j - weight[0]] + value[0];
        }

        System.out.println(Arrays.toString(dp[0]));
    }
}
