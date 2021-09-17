/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/5, 13:28
 * @Auther:ShiShc
 */

public class myPow {

    public static double myPow(double x, int n) {
//        if(n == 0) return 1;
//
//        double result = 1;
//        for(int i = 1; i <= Math.abs(n); ++i) {
//            result *= x;
//        }
//
//        return n > 0 ? result : 1/result;
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }
}
