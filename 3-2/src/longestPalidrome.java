/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/22, 8:46
 * @Auther:ShiShc
 */

public class longestPalidrome {

    public static String longestPalidrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String result = "";

        for(int l = 0; l < len; l ++) {
            for(int i = 0; i + l < len; i ++) {
                int j = i + l;
                if(l == 0) {
                    dp[i][j] = true;
                } else if(l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (dp[i+1][j-1] && (s.charAt(i) == s.charAt(j)));
                }

                if(dp[i][j] && l + 1 > result.length()) {
                    result = s.substring(i, j+1);
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
