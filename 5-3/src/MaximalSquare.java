/**
 * @date: 2021-5-14, 10:07
 * @author: ShiShc
 */

public class MaximalSquare {
    public int f(char[][] matrix) {
        if(matrix == null) {
            return 0;
        }
        // dp[i][j]代表：右下角为i,j的正方形的最大边长
        int[][] dp = new int[matrix.length][matrix[0].length];
        int maxSide = 0;
        // dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + 1;
        // Init: i == 0, j == 0;
        for(int i = 0;i < matrix.length;i ++) {
            for(int j = 0;j < matrix[0].length;j ++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = Integer.parseInt(String.valueOf(matrix[i][j]));
                } else {
                    if(matrix[i][j] == '0') {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    }
                }

                maxSide = Math.max(maxSide, dp[i][j]);
            }
        }
        // return dp[i][j] ^ 2;
        return maxSide * maxSide;
    }

    public static void main(String[] args) {
//        System.out.println(new MaximalSquare().f(new char[][]{{'1', '0', '1', '0', '0'},
//                {'1', '0', '1', '1', '1'},
//                {'1', '1', '1', '1', '1'},
//                {'1', '0', '0', '1', '0'}}
//        ));
        System.out.println(new MaximalSquare().f(new char[][]{
                {'0', '1'},
                {'1', '0'}
        }));
    }
}
