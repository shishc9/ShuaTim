/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 9:48
 * @Auther:ShiShc
 */

/**
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class fib {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int f0 = 0, f1 = 1, result = 1;
        while(n >= 2) {
            result = f0 + f1;
            result = result % 1000000007;
            f0 = f1;
            f1 = result;
            n --;
        }

        return result;
    }

    public static void main(String[] args) {
        fib fib = new fib();
        System.out.println(fib.fib(2));
        System.out.println(fib.fib(5));
        System.out.println(fib.fib(7));
    }
}
