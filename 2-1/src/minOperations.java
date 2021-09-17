import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 11:25
 * @Auther:ShiShc
 */

public class minOperations {

    public static int minOperations(String[] logs) {
        int length = logs.length;
        int result = 0;
        int pos = 0;

        Stack<String> stack = new Stack<>();

        while(pos < length) {
            if(logs[pos].equals("./")) {
                pos++;
                continue;
            } else if(logs[pos].equals("../")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(logs[pos]);
            }

            pos++;
        }

        for(String s:stack) {
            result ++;
        }

        return result;
    }


    public static void main(String[] args) {
        String[] logs1 = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs2 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        String[] logs3 = {"d1/", "../", "../", "../"};
        System.out.println(minOperations(logs1));
        System.out.println(minOperations(logs2));
        System.out.println(minOperations(logs3));
    }
}
