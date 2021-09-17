/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 15:49
 * @Auther:ShiShc
 */

public class JumpFloor {

    public int JumpFloor(int target) {
        return fib(target);
    }

    private int fib(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int f0 = 1, f1 = 2, result = 0;
        for(int i = 2;i < n;i ++) {
            result = f0 + f1;
            f0 = f1;
            f1 = result;
        }

        return result;
    }


    public static void main(String[] args) {
    }
}
