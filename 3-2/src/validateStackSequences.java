import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 15:45
 * @Auther:ShiShc
 */

public class validateStackSequences {
    public boolean validateStackSequences (int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int index = 0;

        for(int num : pushed) {
            stack.push(num);
            while(!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index ++;
            }
        }

        return stack.isEmpty();
    }
}
