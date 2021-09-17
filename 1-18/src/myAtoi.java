import sun.applet.Main;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/21, 19:39
 * @Auther:ShiShc
 */

class AutoMata {
    long answer = 0;
    int sign = 1;
    private String state = "start";
    private Map<String, String[]> table = new HashMap<String, String[]>() {{
        put("start", new String[]{"start", "signed", "in_number", "end"});
        put("signed", new String[]{"end", "end", "in_number", "end"});
        put("in_number", new String[]{"end", "end", "in_number", "end"});
        put("end", new String[]{"end", "end", "end", "end"});
    }};

    public void get(char c) {
        state = table.get(state)[get_col(c)];
        if("in_number".equals(state)) {
            answer = answer*10 + c - '0';
            answer = sign == 1? Math.min(answer, (long)Integer.MAX_VALUE) : Math.min(answer, -(long)Integer.MIN_VALUE);
        } else if("signed".equals(state)) {
            sign = c == '+' ? 1 : -1;
        }
    }

    private int get_col(char c) {
        if(c == ' ') {
            return 0;
        }
        if(c == '+' || c == '-') {
            return 1;
        }
        if(Character.isDigit(c)) {
            return 2;
        }
        return 3;
    }
}

public class myAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("-12345"));
        System.out.println(myAtoi("-12+45"));
        System.out.println(myAtoi("-2147483648"));
        System.out.println(myAtoi("-2147483649"));
        System.out.println(myAtoi("12345"));
    }

    public static int myAtoi(String s) {
        AutoMata autoMata = new AutoMata();
        int length = s.length();
        for(int i = 0;i < length; ++ i) {
            autoMata.get(s.charAt(i));
        }

        return (int)(autoMata.sign * autoMata.answer);
    }
}
