import java.util.HashMap;

/**
 * @date: 2021-5-15, 20:38
 * @author: ShiShc
 */

public class RomanToInt {
    private final HashMap<String, Integer> dic = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }
    };

    public int f(String s) {
        int result = 0;
        for(int i = 0;i < s.length();i ++) {
            String c = String.valueOf(s.charAt(i));
            switch (c) {
                case "I": {
                    if(i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                        String temp = s.substring(i, i + 2);
                        result += dic.get(temp);
                        i ++;
                    } else {
                        result += dic.get(c);
                    }
                    break;
                }
                case "X": {
                    if(i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                        String temp = s.substring(i, i+2);
                        result += dic.get(temp);
                        i ++;
                    } else {
                        result += dic.get(c);
                    }
                    break;
                }
                case "C": {
                    if(i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        String temp = s.substring(i, i+2);
                        result += dic.get(temp);
                        i ++;
                    } else {
                        result += dic.get(c);
                    }
                    break;
                }
                default: {
                    result += dic.get(c);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInt().f("XXVII"));
        System.out.println(new RomanToInt().f("XXIX"));
        System.out.println(new RomanToInt().f("CMXC"));
    }
}
