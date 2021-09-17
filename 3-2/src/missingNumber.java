/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 18:49
 * @Auther:ShiShc
 */

public class missingNumber {

    public int missingNumber(int[] nums) {


        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == mid) left = mid + 1;
            else  right = mid - 1;
        }

        return left;
    }

    public static void main(String[] args) {

    }
}
