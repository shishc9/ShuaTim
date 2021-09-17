import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/4, 14:33
 * @Auther:ShiShc
 */

public class calculate {

    public static int calculate(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int digital = 0;
        int result = 0;
        int sign = 1;

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if(Character.isDigit(c)) {
                digital = 10*digital + (int)(c - '0');
            } else if(c == '+') {
                result += digital * sign;
                digital = 0;
                sign = 1;
            } else if(c == '-') {
                result += digital * sign;
                digital = 0;
                sign = -1;
            } else if(c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if(c == ')') {
                result += sign*digital;
                result *= stack.pop();
                result += stack.pop();
                digital = 0;
            }
        }

        return result + (sign * digital);
    }



    public static void main(String[] args) {
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
