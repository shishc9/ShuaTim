/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 10:22
 * @Auther:ShiShc
 */

/**
 * [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 */
public class maxValue {
    public static int maxValue (int[][] grid) {
        int row = grid.length - 1, column = grid[0].length - 1;
        for(int i = 0; i <= row; i ++) {
            for(int j = 0; j <= column; j ++) {
                if(i == 0 && j == 0) continue;
                if(i == 0) grid[i][j] += grid[i][j-1];
                else if(j == 0) grid[i][j] += grid[i-1][j];
                else grid[i][j] += Math.max(grid[i-1][j], grid[i][j-1]);
            }
        }

        return grid[row][column];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(maxValue(grid));



//        int i = 0, j = 0;
//        while(true) {
//            if(i == row && j == column) {
//                return grid[i][j];
//            }
//            if(i == row) {
//                int sum = 0;
//                while(j <= column) {
//                    sum = sum + grid[i][j];
//                    j ++;
//                }
//                return sum;
//            }
//            if(j == column) {
//                int sum = 0;
//                while(i <= row) {
//                    sum = sum + grid[i][j];
//                    i ++;
//                }
//                return sum;
//            }
//            if(i == 0 && j == 0) continue;
//            grid[i][j] = grid[i][j] + (grid[i-1][j] > grid[i][j-1] ? grid[i-1][j] : grid[i][j-1]);
//        }
    }
}
