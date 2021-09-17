import java.util.Calendar;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 20:23
 * @Auther:ShiShc
 */

public class isValid {

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        int needBreak = 0;

        for(int i = 0;i < s.length(); ++i) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    needBreak = 1;
                    break;
                }
                stack.pop();
            } else if(c == '}') {
                if(stack.isEmpty() || stack.peek() != '{') {
                    needBreak = 1;
                    break;
                }
                stack.pop();
            } else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    needBreak = 1;
                    break;
                }
                stack.pop();
            }
        }

        if(needBreak == 1 || !stack.isEmpty()) {
            return false;
        }
        return true;
    }



    public static void main(String[] args) {

    }
}
