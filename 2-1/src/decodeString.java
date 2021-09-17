import java.util.LinkedList;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/4, 15:17
 * @Auther:ShiShc
 */

public class decodeString {

    public static String decodeString(String s) {

        LinkedList<Integer> stackSup = new LinkedList<>();
        LinkedList<String> stackResult = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        int digit = 0;

        for(int i = 0;i < s.length(); ++i) {
            char c = s.charAt(i);

            if(Character.isDigit(c)) {
                digit = digit*10 + (int)(c - '0');
            } else if(c >= 'a' && c <= 'z') {
                result.append(c);
            } else if(c == '[') {
                stackSup.addLast(digit);
                stackResult.addLast(result.toString());
                digit = 0;
                result = new StringBuilder();
            } else if(c == ']') {
                StringBuilder temp = new StringBuilder();
                int curDigit = stackSup.removeLast();
                for(int j = 0; j < curDigit; ++j) temp.append(result);
                result = new StringBuilder(stackResult.removeLast() + temp);
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

}
