/**
 * @date: 2021-4-18, 17:05
 * @author: ShiShc
 */

public class maxSubArray {
    public int f(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        if(len == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1;i < len; i++) {
            nums[i] += Math.max(0, nums[i-1]);
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new maxSubArray().f(new int[]{1,6,9,-10,-7,20,1}));
        System.out.println(new maxSubArray().f(new int[]{1,6,9,-10,-3,20,1}));
    }
}
