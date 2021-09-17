/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/30, 14:57
 * @Auther:ShiShc
 */

public class countDigitOne {
    public static void main(String[] args) {
        System.out.println(countDigitOne(12));
        System.out.println(countDigitOne(13));
    }

    public static int countDigitOne(int n) {
        int digit = 1, res = 0;
        int high = n/10, low = 0, curr = n%10;

        while (high != 0 || curr != 0) {
            if(curr == 0) res += high*digit;
            else if(curr == 1) res += high*digit + low + 1;
            else res += (high + 1) * digit;

            low += curr * digit;
            curr = high%10;
            high /= 10;
            digit *= 10;
        }

        return res;
    }

}
