import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 8:28
 * @Auther:ShiShc
 */

public class minNumber {

    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; ++i) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (x,y) -> (x+y).compareTo(y+x));

        StringBuilder result = new StringBuilder();
        for(String s:strs) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {

    }
}
