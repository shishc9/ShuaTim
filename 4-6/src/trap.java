/**
 * @date: 2021-4-27, 10:06
 * @author: ShiShc
 */

public class trap {
    public int f(int[] height) {
        int result = 0;
        for(int i = 0;i < height.length;i ++) {
            int leftMax = 0, rightMax = 0;
            for(int j = i; j >= 0; j --) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for(int j = i; j < height.length; j ++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            result += Math.min(leftMax, rightMax) - height[i];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(new trap().f(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
