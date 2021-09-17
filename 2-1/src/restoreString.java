/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/4, 18:56
 * @Auther:ShiShc
 */

public class restoreString {

    public static String restoreString(String s, int[] indices) {

        int length = s.length();
        char[] result = new char[length];

        for(int i = 0;i < length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }
}
