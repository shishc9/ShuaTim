import java.util.Arrays;
import java.util.Stack;

public class LC503 {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        Arrays.fill(result, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < length * 2;i ++) {
            while(!stack.isEmpty() && nums[i % length] > nums[stack.peek()]) {
                result[stack.peek()] = nums[i % length];
                stack.pop();
            }
            stack.push(i % length);
        }

        return result;
    }
}
