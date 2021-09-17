import java.util.HashSet;
import java.util.List;

/**
 * @date:2021-4-13, 16:51
 * @author:ShiShc
 */

public class wordBreak {
    public boolean f(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 1;i <= s.length();i ++) {
            for(int j = 0;j < i;j ++) {
                if(dp[j] && dict.contains(s.substring(j,i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println("abcdef".substring(1,3));
    }
}
