import java.util.Arrays;
import java.util.Comparator;

public class LC452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) {
            return 0;
        }

        int result = 1;
        // 小于 表示要不需要交换两个值的位置  大于 表示要交换两个值的位置
        Arrays.sort(points, Comparator.comparingInt(o -> o[0]));

        for(int i = 1;i < points.length;i ++) {
            if(points[i][0] > points[i - 1][1]) {
                result ++;
            } else {
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(
                new LC452().findMinArrowShots(new int[][]{
                        {10, 16},
                        {2, 8},
                        {1, 6},
                        {7, 12}
                })
        );

        System.out.println(
                new LC452().findMinArrowShots(new int[][]{
                        {-2147483646, -2147483645},
                        {2147483646, 2147483647}
                })
        );
    }
}
