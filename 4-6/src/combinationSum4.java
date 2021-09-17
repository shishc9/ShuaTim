/**
 * @date: 2021-4-24, 10:00
 * @author: ShiShc
 */

public class combinationSum4 {
    public int f(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1;i <= target; i++) {
            for(int num : nums) {
                if(num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }


        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(new combinationSum4().f(new int[]{1, 2, 3}, 4));
    }
}
