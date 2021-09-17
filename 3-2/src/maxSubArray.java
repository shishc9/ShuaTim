/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 10:03
 * @Auther:ShiShc
 */

/**
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */

public class maxSubArray {
    public static int maxSubArray (int[] nums) {
        int length = nums.length;
        int max = nums[0];

        for(int i = 1;i < length;i ++) {
            int temp = Math.max(nums[i-1], 0);
            nums[i] += temp;
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
