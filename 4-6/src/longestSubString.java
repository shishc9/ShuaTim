/**
 * @date:2021-4-14, 09:44
 * @author:ShiShc
 */

public class longestSubString {
    public int f(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if(len1 == 0 || len2 == 0) {
            return 0;
        }
        int[][] dp = new int[len1+1][len2+1];
        int max = Integer.MIN_VALUE;
        for(int i = 1;i <= len1;i ++) {
            for(int j = 1;j <= len2;j ++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new longestSubString().f("abcdef1", "cdef"));
    }
}
