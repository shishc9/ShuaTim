/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/21, 19:15
 * @Auther:ShiShc
 * 7. 整数反转
 */

public class reverse {
    public static void main(String[] args) {
        int a = 100, b = 0, c = 2147483647, d = -2147483648;
        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
        System.out.println(reverse(d));
    }

    public static int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int temp = x%10;
            x /= 10;

            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE && temp > 7)) return 0;
            if(result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE && temp < -8)) return 0;

            result = result * 10 + temp;
        }
        return result;
    }
}
