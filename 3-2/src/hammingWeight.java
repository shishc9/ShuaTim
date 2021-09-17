/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 8:49
 * @Auther:ShiShc
 */

public class hammingWeight {

    public int hammingWeight(int n) {
        int result = 0;
        while(n != 0) {
            result += n&1;
            n >>>= 1;
        }
        return result;
    }


    public static void main(String[] args) {

    }
}
