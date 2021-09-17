/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/30, 17:03
 * @Auther:ShiShc
 */

public class strToInt {
    public static void main(String[] args) {
        System.out.println(strToInt("   -42"));
        System.out.println(strToInt("4193 with words"));
        System.out.println(strToInt("words and 987"));
        System.out.println(strToInt("42"));
    }

    public static int strToInt(String str) {
        int result = 0, boundary = Integer.MAX_VALUE/10;
        int i = 0, sign = 1, length = str.length();

        if(length == 0) return 0;

        while(str.charAt(i) == ' ')
            if(++i == length) return 0;
        if(str.charAt(i) == '-') sign = -1;
        if(str.charAt(i) == '-' || str.charAt(i) == '+') i++;

        for(int j = i; j < length; ++j) {
            if(str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if (result > boundary || result == boundary && str.charAt(j) > '7')
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + (str.charAt(j) - '0');
        }

        return sign * result;
    }

}
