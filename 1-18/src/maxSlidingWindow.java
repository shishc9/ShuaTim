import java.util.Arrays;
import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 19:38
 * @Auther:ShiShc
 */

public class maxSlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        if(nums.length == 0 || k == 0) return new int[0];

        int[] result = new int[nums.length - k + 1];
        int pos = 0;
        for(int i = 0; i < nums.length-k+1; ++i) {
            result[i] = findMax(nums, i, k);
        }

        return result;
    }

    public static int findMax(int[] nums, int pos, int k) {
        int max = nums[pos];
        for(int i = 0;i < k; ++ i) {
            if(nums[pos] > max) max = nums[pos];
            pos++;
        }

        return max;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] result = maxSlidingWindow(nums, 3);

        for(int i = 0; i < result.length; ++i) {
            System.out.println(result[i]);
        }
    }

}
