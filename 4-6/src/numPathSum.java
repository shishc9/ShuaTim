/**
 * @date:2021-4-13, 16:22
 * @author:ShiShc
 */

public class numPathSum {
    public int f(int[][] grid) {
        int column = grid.length, row = grid[0].length;
        for(int i = 0; i < column ; i ++) {
            for(int j = 0; j < row;j ++) {
                if(i == 0 && j == 0) {
                    continue;
                } else if(i == 0) {
                    grid[i][j] += grid[i][j-1];
                } else if(j == 0) {
                    grid[i][j] += grid[i-1][j];
                } else {
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }

        }

        return grid[column-1][row-1];
    }
}
