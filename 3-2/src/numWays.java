/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 9:58
 * @Auther:ShiShc
 */

/**
 * 1 1
 * 2 2
 * 3 3
 * 4 5
 */

public class numWays {
    public static int numWays(int n) {
        if(n == 1 || n == 0) return 1;
        if(n == 2) return 2;
        int f0 = 1, f1 = 2, result = 2;
        while(n > 2) {
            result = f0 + f1;
            result %= 1000000007;
            f0 = f1;
            f1 = result;
            n--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
        System.out.println(numWays(0));
        System.out.println(numWays(1));
    }
}
