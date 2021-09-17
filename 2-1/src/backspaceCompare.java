import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 19:39
 * @Auther:ShiShc
 */

public class backspaceCompare {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < S.length(); ++i) {
            char c = S.charAt(i);
            if(c == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if(c != '#') {
                stack.push(c);
            }
        }
        String str1 = stackToString(stack);

        stack.clear();

        for(int i = 0; i< T.length(); ++i) {
            char c = T.charAt(i);
            if(c == '#' && !stack.isEmpty()) {
                stack.pop();
            } else if(c != '#') {
                stack.push(c);
            }
        }
        String str2 = stackToString(stack);

        return str1.equals(str2);
    }

    public static String stackToString(Stack<Character> stack) {
        char[] cs = new char[stack.size()];
        int pos = 0;
        for(char c:stack) {
            cs[pos++] = c;
        }

        return String.valueOf(cs);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("xywrrmp", "xywrrmu#p"));
    }
}
