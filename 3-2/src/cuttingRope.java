/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 23:58
 * @Auther:ShiShc
 */


/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
 * 请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 *
 */
public class cuttingRope {
    public static int cuttingRope(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n == 4) return 4;
        int i = n % 3, j = n/3;
        int sum = 0;
        return (int) (i == 1 ? Math.pow(3, j-1) * 4 : i == 0 ? Math.pow(3, j) : Math.pow(3, j) * 2);
    }


    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
        System.out.println(cuttingRope(2));
        System.out.println(cuttingRope(8));
        System.out.println(cuttingRope(6));
    }
}
