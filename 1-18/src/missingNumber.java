/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 14:45
 * @Auther:ShiShc
 */

public class missingNumber {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4,6,7,8,9};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {

        int left = 0, right = nums.length-1, mid = 0;
        while(left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left]==left?nums[left]+1:nums[left]-1;

    }

}
