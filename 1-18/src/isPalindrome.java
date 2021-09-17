/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/21, 20:51
 * @Auther:ShiShc
 *
 */

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int result = 0;
        int temp = x;
        while(x != 0) {
            result = result*10 + x%10;
            x = x/10;
        }

        return result == temp;
    }

}
