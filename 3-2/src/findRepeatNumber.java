import java.util.HashSet;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 17:04
 * @Auther:ShiShc
 */

public class findRepeatNumber {

    public static int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = -1;

        for(int i:nums) {
            if(set.contains(i)) {
                result = i;
                break;
            }
            set.add(i);
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
