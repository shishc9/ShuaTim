/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 15:01
 * @Auther:ShiShc
 */

public class spiralOrder {
    public static int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];

        int top = 0, bottom = matrix.length-1, left = 0, right = matrix[0].length-1;
        int[] result = new int[(bottom+1)*(right+1)];
        int x = 0;
        while(true) {
            for(int i = left;i <= right; i++) result[x++] = matrix[top][i];
            if(++top > bottom) break;
            for(int i = top;i <= bottom; i++) result[x++] = matrix[i][right];
            if(--right < left) break;
            for(int i = right; i >= left; i--) result[x++] = matrix[bottom][i];
            if(top > --bottom) break;
            for(int i = bottom; i >= top; i--) result[x++] = matrix[i][left];
            if(++left > right) break;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[] result = spiralOrder(matrix);
        for(int i : result) {
            System.out.println(i);
        }
    }
}
