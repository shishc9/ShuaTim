/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 16:20
 * @Auther:ShiShc
 */

/**
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 */

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0) return new int[0];
        int left = 0, right = nums.length - 1;
        while(left < right) {
            if(nums[left] + nums[right] == target)
                return new int[]{nums[left], nums[right]};
            else if(nums[left] + nums[right] < target) {
                left ++;
            } else {
                right --;
            }
        }

        return new int[0];
    }
}
