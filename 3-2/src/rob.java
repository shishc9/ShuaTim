/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/28, 10:34
 * @Auther:ShiShc
 */

public class rob {
    public static int rob(int[] nums) {
        int pre = 0, cur = 0, temp;
        for(int i : nums) {
            temp = cur;
            cur = Math.max(cur, pre + i);
            pre = temp;
        }

        return cur;
    }

    public static void main(String[] args) {

    }
}
