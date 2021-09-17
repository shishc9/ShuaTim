import java.util.Stack;

/**
 * @date: 2021-5-14, 10:44
 * @author: ShiShc
 */
public class ReverseParentheses {
    public String f(String s) {
        StringBuilder result = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '(') {
                stack.push(i);
                int pos = i + 1;
                while (!stack.isEmpty()) {
                    if (result.charAt(pos) == '(') {
                        stack.push(pos);
                    } else if (result.charAt(pos) == ')') {
                        Integer left = stack.pop();
                        if(pos == left + 1) {
                            result.delete(left, pos+1);
                            pos = pos - 2;
                            continue;
                        }
                        result.replace(left, pos+1, reverse(result.substring(left + 1, pos)));
                        pos = pos - 2;
                        continue;
                    }
                    pos ++;
                }
                i = pos+1;
            }
        }

        return result.toString();
    }

    private String reverse(String s) {
        StringBuilder str = new StringBuilder(s);
        return str.reverse().toString();
    }

    public static void main(String[] args) {
//        System.out.println("abcd".substring(0,2));
//        System.out.println(new StringBuilder("abcdefg").replace(0,3, "dcs"));
//        System.out.println(new ReverseParentheses().f("(ed(et(oc))el)"));
        System.out.println(new ReverseParentheses().f("uxbpgfzt(cn(nnn()))"));
        System.out.println(new ReverseParentheses().f("f(ul)ao(t(y)qbn)()sj"));
    }
}
