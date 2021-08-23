public class LC583 {
    public int minDistance1(String word1, String word2) {
        if(word1.length() == 0 || word2.length() == 0) {
            return 0;
        }

        int length1 = word1.length();
        int length2 = word2.length();

        int[][] dp = new int[length1 + 1][length2 + 1];

        for(int i = 0;i <= length1;i ++) {
            dp[i][0] = i;
        }
        for(int j = 0;j <= length2; j ++) {
            dp[0][j] = j;
        }

        for(int i = 1;i <= length1;i ++) {
            for(int j = 1;j <= length2;j ++) {
                if(word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j] + 1, Math.min(dp[i][j-1] + 1, dp[i-1][j-1] + 2));
                }
            }
        }

        return dp[length1][length2];
    }
    public int minDistance2(String word1, String word2) {
        if(word1.length() == 0 || word2.length() == 0) {
            return 0;
        }

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for(int i = 0;i < word1.length();i ++) {
            dp[i][0] = 0;
        }
        for(int i = 0;i < word2.length();i ++) {
            dp[0][i] = 0;
        }

        for(int i = 1;i <= word1.length();i ++) {
            for(int j = 1;j <= word2.length();j ++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return word1.length() + word2.length() - dp[word1.length()][word2.length()] * 2;
    }

    public static void main(String[] args) {
//        System.out.println(new LC583().minDistance("sea", "eat"));
    }
}
