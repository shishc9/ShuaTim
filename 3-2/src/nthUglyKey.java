/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 11:12
 * @Auther:ShiShc
 */

/**
 *
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 *
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
 *
 * 怎么证出来的 ？
 */

public class nthUglyKey {
    public static int nthUglyKey(int n) {
        if(n <= 6) return n;
        int i2 = 0, i3 = 0, i5 = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; ++i) {
            dp[i] = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if(dp[i] == dp[i2] * 2)
                i2 ++;
            if(dp[i] == dp[i3] * 3)
                i3 ++;
            if(dp[i] == dp[i5] * 5)
                i5 ++;
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyKey(10));
    }
}
