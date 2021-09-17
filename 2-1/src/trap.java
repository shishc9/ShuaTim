/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 21:16
 * @Auther:ShiShc
 */

public class trap {

    public static int trap(int[] height) {
        if(height.length < 3) {
            return 0;
        }

        int left = 0, right = height.length-1;
        int leftMax = height[left], rightMax = height[right];

        int result = 0;

        while(left < right) {
            if(leftMax < rightMax) {
                result += leftMax - height[left++];
                leftMax = Math.max(leftMax, height[left]);
            } else {
                result += rightMax - height[right--];
                rightMax = Math.max(rightMax, height[right]);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
