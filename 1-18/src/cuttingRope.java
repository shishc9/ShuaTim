/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/29, 13:56
 * @Auther:ShiShc
 */

public class cuttingRope {
    public static void main(String[] args) {
        System.out.println(cuttingRope(2));
        System.out.println(cuttingRope(8));
        System.out.println(cuttingRope(10));
    }

    public static int cuttingRope(int n) {
        return n <= 3? n-1:(int)(Math.pow(3, n/3)*4/(4-n%3));
    }

}
