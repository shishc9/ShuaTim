import java.util.Arrays;

/**
 * @date: 2021-5-11, 16:52
 * @author: ShiShc
 */

public class RepeatTimes {
    public int f(int[] A) {
        for(int i = 0; i < A.length - 1; i++) {
            if(A[i] == A[i+1]) {
                return A[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
