import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 19:22
 * @Auther:ShiShc
 * 45: 把数组排成最小的数
 */

public class minNumber {

    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0;i < nums.length; ++i) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (x,y)->(x+y).compareTo(y+x));

        StringBuilder result = new StringBuilder();
        for(String s : strs) {
            result.append(s);
        }

        return result.toString();

    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};

        System.out.println(minNumber(nums));

    }
}
