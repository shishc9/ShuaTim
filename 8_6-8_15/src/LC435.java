import java.util.Arrays;

public class LC435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int length = intervals.length;
        if(length == 0) {
            return 0;
        }

        int result = 1;

        Arrays.sort(intervals, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }

            return Integer.compare(o1[0], o2[0]);
        });

        for(int i = 1;i < length;i ++) {
            if(intervals[i][0] >= intervals[i - 1][1]) {
                result ++;
            } else {
                intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
            }
        }

        return length - result;
    }

    public static void main(String[] args) {
        System.out.println(
                new LC435().eraseOverlapIntervals(new int[][] {
                        {-52, 31},
                        {-73, -26},
                        {82, 97},
                        {-65, -11},
                        {-62, -49},
                        {95, 99},
                        {58, 95},
                        {-31, 49},
                        {66, 98},
                        {-63, 2},
                        {30, 47},
                        {-40, -26},
                })
        );
    }
}
