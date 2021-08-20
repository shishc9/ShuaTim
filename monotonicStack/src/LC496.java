import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];
        Arrays.fill(result, -1);
        if(nums1.length == 0) {
            return result;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums1.length;i ++) {
            map.put(nums1[i], i);
        }

        stack.push(0);

        for(int i = 0;i < nums2.length;i ++) {
            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                if(map.containsKey(nums2[stack.peek()])) {
                    int index = map.get(nums2[stack.peek()]);
                    result[index] = nums2[i];
                }
                stack.pop();
            }
            stack.push(i);
        }

        return result;
    }
}
