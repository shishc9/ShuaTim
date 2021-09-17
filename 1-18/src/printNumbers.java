/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/29, 15:16
 * @Auther:ShiShc
 */

public class printNumbers {
    public static void main(String[] args) {
        int[] result = printNumbers(3);
        System.out.println(result.length);
    }


    public static int[] printNumbers(int n) {
        int end = (int) (Math.pow(10,n)-1);
        int[] result = new int[end];
        for(int i = 0;i < end; ++i) {
            result[i] = i+1;
        }

        return result;
    }

}
