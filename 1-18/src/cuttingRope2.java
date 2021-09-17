/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/29, 14:50
 * @Auther:ShiShc
 */

public class cuttingRope2 {
    public static void main(String[] args) {

    }

    public static int cuttingRope2(int n) {
        if(n <= 3) return n-1;
        else if(n == 4) return 4;

        long res = 1L;
        while(n > 4) {
            res *= 3;
            res %= 1000000007;
            n -= 3;
        }

        return (int)(res*n%1000000007);
    }

}
