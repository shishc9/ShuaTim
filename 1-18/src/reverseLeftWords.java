/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 6:10
 * @Auther:ShiShc
 */

public class reverseLeftWords {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
        System.out.println(reverseLeftWords("lrloseumgh",6));
    }

    public static String reverseLeftWords(String s, int n) {
        String frontString = s.substring(0,n);
        String behindString = s.substring(n);
        return behindString+frontString;
    }

}
