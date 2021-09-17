import java.util.Arrays;

/**
 * @date: 2021-5-3, 15:16
 * @author: ShiShc
 */

public class countBits {
    public int[] f(int num) {
        int[] nums = new int[num + 1];
        for(int i = 0;i <= num;i ++) {
            nums[i] = help(i);
        }
        return nums;
    }

    public int help(int x) {
        int result = 0;
        while (x > 0) {
            x &= (x - 1);
            result ++;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new countBits().f(8)));
    }
}
