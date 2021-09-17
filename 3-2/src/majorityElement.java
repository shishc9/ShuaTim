import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 8:59
 * @Auther:ShiShc
 */

public class majorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    public static void main(String[] args) {

    }
}
