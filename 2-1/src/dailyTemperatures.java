import java.util.Arrays;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 20:57
 * @Auther:ShiShc
 */

public class dailyTemperatures {

    public static int[] dailyTemperatures(int[] T) {
        int length = T.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];

        for(int i = 0;i < length; ++i) {
            int temp = T[i];
            while(!stack.isEmpty() && temp > T[stack.peek()]) {
                int day = stack.pop();
                result[day] = i - day;
            }
            stack.push(i);
        }

        return result;

    }


    public static void main(String[] args) {
         int[] temperatures = {73,74,75,71,69,72,76,73};
         int[] result = dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(result));
    }
}
