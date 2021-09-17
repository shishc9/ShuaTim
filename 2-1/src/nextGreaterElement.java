import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 11:51
 * @Auther:ShiShc
 */

public class nextGreaterElement {

    /**
     * 不用暴力解法 用单调栈
     * @param nums1
     * @param nums2
     * @return
     */

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[nums1.length];

        for(int i = 0;i < nums2.length; ++i) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while(!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        for(int i = 0;i < nums1.length; ++i) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
