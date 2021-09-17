/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/19, 15:10
 * @Auther:ShiShc
 * 5. 最长回文子串
 */

public class longestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        String answer = "";
        boolean[][] dp = new boolean[length][length];

        for(int pos = 0; pos < length; ++pos) {
            for(int i = 0; i+pos < length; ++i) {
                int j = i + pos;
                if(pos == 0) {
                    dp[i][j] = true;
                }
                else if(pos == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }
                else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]);
                }

                if(dp[i][j] && pos+1 > answer.length()) {
                    answer = s.substring(i, i+pos+1);
                }
            }
        }

        return answer;
    }

}
