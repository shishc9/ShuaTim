import java.util.Arrays;

public class LC59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int startX = 0, startY = 0;
        int loop = n / 2;
        int mid = n / 2;
        int count = 1;
        int offset = 1;
        int i, j;

        while(loop -- != 0) {
           i = startX;
           j = startY;

           for(j = startY; j < n - offset;j ++) {
               result[startX][j] = count ++;
           }

           for(i = startX; i < n - offset;i ++) {
               result[i][j] = count ++;
           }

           for(;j > startY;j --) {
               result[i][j] = count ++;
           }

           for(;i > startX;i --) {
               result[i][j] = count ++;
           }

           startX ++;
           startY ++;

           offset += 1;
        }

        if(n % 2 != 0) {
            result[mid][mid] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new LC59().generateMatrix(5);
        System.out.println(Arrays.deepToString(matrix));
    }
}
