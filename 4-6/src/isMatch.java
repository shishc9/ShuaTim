/**
 * @date:2021/4/7, 23:56
 * @author:ShiShc
 */

public class isMatch {
    public static boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();

        boolean[][] dp = new boolean[slen + 1][plen + 1];
        dp[0][0] = true;
        for(int i = 0;i <= slen; i++) {
            for(int j = 1;j <= plen; j++) {
                if(p.charAt(j-1) == '*') {
                    dp[i][j] = dp[i][j-2];
                    if(match(s, p, i,j-1)) {
                        dp[i][j] = dp[i-1][j];
                    }
                } else {
                    if(match(s, p, i, j)) {
                        dp[i][j] = dp[i-1][j-1];
                    }
                }
            }
        }

        return dp[slen][plen];
    }

    private static boolean match(String s, String p, int i, int j) {
        if(i == 0) {
            return false;
        }
        if(p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

    public static void main(String[] args) {
        //System.out.println(isMatch("mississippi", "mis*is*p*"));
        System.out.println(isMatch("aab", "c*a*b"));
    }
}
