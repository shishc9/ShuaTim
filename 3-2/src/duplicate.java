import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 13:28
 * @Auther:ShiShc
 */

public class duplicate {

    public static int duplicate (int[] nums) {
        HashMap<Integer, Integer> dic = new HashMap<>();
        int result = 0;
        for(int i = 0;i < nums.length; ++i) {
            if(!dic.containsKey(nums[i])) {
                dic.put(nums[i], i);
            } else {
                result = nums[i];
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
