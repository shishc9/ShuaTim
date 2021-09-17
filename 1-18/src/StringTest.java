/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/30, 20:58
 * @Auther:ShiShc
 */

public class StringTest {
    public static void main(String[] args) {

        String s = "myTest";

        /**
         * valueOf(boolean, char[], double ,float, int ,long, Object)
         */
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(9));

        char[] chars = {'a','b','c'};
        System.out.println(String.valueOf(chars));
        // print("abc");

    }
}
