/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 20:09
 * @Auther:ShiShc
 */

public class makeGood {

    public static String makeGood(String s) {
        StringBuffer result = new StringBuffer();
        int length = s.length();
        int pos = -1;

        for(int i = 0;i < length; ++ i) {
            char c = s.charAt(i);
            if(result.length() > 0 && Character.toLowerCase(result.charAt(pos)) == Character.toLowerCase(c) && result.charAt(pos) != c) {
                result.deleteCharAt(pos);
                pos --;
            } else {
                result.append(c);
                pos ++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
}
