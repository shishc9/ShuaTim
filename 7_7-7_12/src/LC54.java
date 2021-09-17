import java.util.ArrayList;
import java.util.List;

public class LC54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int length = n * m;
        ArrayList<Integer> result = new ArrayList<>(length);

        int startX = 0, startY = 0;
        int offset = 1;
        int midX = n / 2, midY = m / 2;
        int loop = Math.min(n, m) / 2;
        int i, j;

        while(loop -- != 0) {
            i = startX;
            j = startY;

            for(j = startY;j < m - offset;j ++) {
                result.add(matrix[i][j]);
            }

            for(i = startX;i < n - offset;i ++) {
                result.add(matrix[i][j]);
            }

            for(;j > startY;j --) {
                result.add(matrix[i][j]);
            }

            for(;i > startX;i --) {
                result.add(matrix[i][j]);
            }

            startX ++;
            startY ++;

            offset ++;
        }

        if(Math.min(n, m) % 2 == 1) {
            if(n < m) {
                for(i = Math.min(n, m) / 2; i <= m - offset;i ++) {
                    result.add(matrix[n / 2][i]);
                }
            } else {
                for(j = Math.min(n, m) / 2;j <= n - offset;j ++) {
                    result.add(matrix[m / 2][j]);
                }
            }
        }

        return result;
    }

}
