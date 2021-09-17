/**
 * @date: 2021-4-22, 21:29
 * @author: ShiShc
 */

public class maxSumSubmatrix {
    public int f(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int result = Integer.MIN_VALUE;
        for(int left = 0; left < n; left++) {
            int[] sums = new int[m];
            for(int start = left; start < n; start ++) {
                for(int up = 0; up < m; up ++) {
                    sums[up] += matrix[up][start];
                }

                for(int i = 0;i < sums.length;i ++) {
                    int sum = sums[i];
                    if(sum == k) {
                        return k;
                    } else if(sum < k) {
                        result = Math.max(sum, result);
                    }
                    for(int j = i; j < sums.length;j ++) {
                        sum += sums[j];
                        if(sum > k) {
                            sum -= sums[j];
                            break;
                        } else if(sum == k) {
                            return sum;
                        }
                    }
                    result = (result < sum) && (sum < k) ? sum : result;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] nums = {
                {2,2,-1}
        };

        int[][] nums2 = {
                {5,-4,-3,4},
                {-3,-4,4,5},
                {5,1,5,-4}
        };

        System.out.println(new maxSumSubmatrix().f(nums, 0));
    }
}
