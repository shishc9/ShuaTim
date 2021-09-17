import java.util.HashSet;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/22, 15:53
 * @Auther:ShiShc
 * 剑指offer03. 数组中重复的数字
 */

public class findRepeatNumber {
    public static void main(String[] args) {
        int[] arr1 =  {2,3,1,0,2,5,3};
        System.out.println(arr1);
    }

    public static int fineRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int repeat = -1;
        for(int num:nums) {
            if(!set.add(num)) {
                repeat = num;
                break;
            }
        }

        return repeat;
    }

}
