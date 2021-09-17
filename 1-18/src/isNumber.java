import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/29, 20:56
 * @Auther:ShiShc
 */

public class isNumber {
    public static void main(String[] args) {
        System.out.println(isNumber("+100"));
        System.out.println(isNumber("5e2"));
        System.out.println(isNumber("-123"));
        System.out.println(isNumber("3.1416"));
        System.out.println(isNumber("-1E-16"));
        System.out.println(isNumber("12e+5.4"));
    }

    public static boolean isNumber(String s) {
        Map[] NFA = {
                new HashMap() {{ put(' ',0); put('s',1); put('d',2); put('.',4); }},
                new HashMap() {{ put('d',2); put('.',4); }},
                new HashMap() {{ put('d',2); put('.',3); put('e',5); put(' ',8); }},
                new HashMap() {{ put('d',3); put('e', 5); put(' ', 8);}},
                new HashMap() {{ put('d',3); }},
                new HashMap() {{ put('s',6); put('d',7); }},
                new HashMap() {{ put('d',7); }},
                new HashMap() {{ put('d',7); put(' ',8); }},
                new HashMap() {{ put(' ',8); }},
        };

        char key;
        int endState = 0;

        for(char c : s.toCharArray()) {
            if(c >= '0' && c <= '9') key = 'd';
            else if(c == '+' || c == '-') key = 's';
            else if(c == '.' || c == ' ') key = c;
            else if(c == 'e' || c == 'E') key = 'e';
            else key = '?';

            if(!NFA[endState].containsKey(key)) return false;
            endState = (int) NFA[endState].get(key);
        }

        return endState == 2 || endState == 3 || endState == 7 || endState == 8;
    }

}
