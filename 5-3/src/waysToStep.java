/**
 * @date: 2021-5-3, 14:57
 * @author: ShiShc
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。

 */

public class waysToStep {
//    动态规划：递归       时间超时
//    public int f(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        if(n == 2) {
//            return 2;
//        }
//        if(n == 3) {
//            return 4;
//        }
//
//        return f(n-1) + f(n-2) + f(n-3);
//    }

    public int f(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(n == 3) {
            return 4;
        }

        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4; i <= n;i ++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            dp[i] %= 1000000007;
        }

        return (int)dp[n];
    }
}
