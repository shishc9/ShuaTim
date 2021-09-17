/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 13:39
 * @Auther:ShiShc
 */

public class findNumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int x = matrix.length, y = matrix[0].length;

        int i = 0, j = y-1;
        while(i < x && j >= 0) {
            if(matrix[i][j] > target) {
                j --;
            } else if(matrix[i][j] < target) {
                i ++;
            } else {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        //System.out.println(findNumberIn2DArray(matrix, 5));
        System.out.println(findNumberIn2DArray(matrix, 20));
    }
}
