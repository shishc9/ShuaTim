/**
 * @date:2021-4-13, 17:01
 * @author:ShiShc
 */

public class rob {
    public int f(int[] nums) {
        int pre = 0, curr = 0, temp;
        for(int num : nums) {
            temp = curr;
            curr = Math.max(curr, num + pre);
            pre = temp;
        }

        return curr;
    }
}
