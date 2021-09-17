import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/28, 10:40
 * @Auther:ShiShc
 */

public class rob2 {
    public static int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return  nums[0];
        return Math.max(help(Arrays.copyOfRange(nums, 0, nums.length - 1)), help(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private static int help(int[] nums) {
        int pre = 0, cur = 0, temp;
        for(int i : nums) {
            temp = cur;
            cur = Math.max(cur, pre + i);
            pre = temp;
        }

        return cur;
    }
}
