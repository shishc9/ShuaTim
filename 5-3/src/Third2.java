import java.util.Arrays;

/**
 * @author: ShiShc
 * @desc:
 */
public class Third2 {
    public int[] scheduling(int[] jobs) {
        Arrays.sort(jobs);
        return jobs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Third2().scheduling(new int[]{15, 8, 3, 10})));
    }
}
