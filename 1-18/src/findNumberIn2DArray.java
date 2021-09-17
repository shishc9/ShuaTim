/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/22, 16:02
 * @Auther:ShiShc
 */

public class findNumberIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };

        System.out.println(findNumberIn2DArray(matrix, 1));
        System.out.println(findNumberIn2DArray(matrix, 31));
        System.out.println(findNumberIn2DArray(matrix, 30));
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = columns - 1;

        while(row < rows && column >= 0) {
            if(matrix[row][column] == target) {
                return  true;
            } else if(matrix[row][column] > target) {
                column --;
            } else {
                row ++;
            }
        }

        return false;
    }

}
