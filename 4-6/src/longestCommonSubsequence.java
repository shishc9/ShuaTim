/**
 * @date:2021-4-14, 09:15
 * @author:ShiShc
 */

public class longestCommonSubsequence {
    public int f(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length();
        if(len1 == 0 || len2 == 0) {
            return 0;
        }
        int[][] dp = new int[len1+1][len2+1];
        for(int i = 1;i <= len1;i ++) {
            for(int j = 1;j <= len2;j ++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(new longestCommonSubsequence().f("abcde", "ace"));
    }
}
