import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        int left = intervals[0][0];
        int right = intervals[0][1];

        for(int i = 1;i < intervals.length;i ++) {
            if(intervals[i][0] <= right) {
                right = Math.max(right, intervals[i][1]);
            } else {
                result.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }

        result.add(new int[]{left, right});

        return result.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new LC56().merge(new int[][]{
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        })));
    }
}
