import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 19:01
 * @Auther:ShiShc
 */

public class scoreOfParentheses {

    /**
     * 在栈中引入深度的概念
     * @param S
     * @return
     */

    public static int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(char c : S.toCharArray()) {
            if(c == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2*v, 1));
            }
        }

        return stack.pop();
    }


    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("(()(()))"));
    }
}
