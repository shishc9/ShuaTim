import java.util.Stack;

public class LC739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];

        stack.add(0);

        for(int i = 0;i < length;i ++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        return result;
    }
}
