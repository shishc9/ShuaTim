/**
 * @date:2021-4-14, 10:54
 * @author:ShiShc
 */

public class MCM {
    public int f(int[] nums) {
        int len = nums.length - 1;
        if(len == 0 || len == 1) {
            return 0;
        }
        int[][] dp = new int[len+1][len+1];
        for(int i = 1; i <= len; i++) {
            for(int j = 1, temp = i;temp <= len;j ++, temp ++) {
                if(temp == j) {
                    dp[j][temp] = 0;
                } else {
                    dp[j][temp] = help(j, temp, nums, dp);
                }
            }
        }

        return dp[1][len];
    }

    private int help(int j, int k, int[] nums, int[][] dp) {
        int min = Integer.MAX_VALUE;
        for(int temp = j; temp < k; temp ++) {
            min = Math.min(min, dp[j][temp] + dp[temp+1][k] + nums[j-1]*nums[temp]*nums[k]);
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new MCM().f(new int[]{3, 5, 2, 1, 10}));
    }
}
