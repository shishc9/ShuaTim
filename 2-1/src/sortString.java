/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/4, 18:42
 * @Auther:ShiShc
 */

public class sortString {


    public static String sortString(String s) {
        int[] chars = new int[26];
        for(int i = 0;i < s.length(); ++i) {
            chars[s.charAt(i) - 'a'] ++;
        }

        StringBuilder result = new StringBuilder();

        while(result.length() < s.length()) {
            for(int i = 0;i < 26; ++i) {
                if(chars[i] > 0) {
                    result.append((char)(i + 'a'));
                    chars[i] --;
                }
            }

            for(int i = 25; i >= 0; --i) {
                if(chars[i] > 0) {
                    result.append((char)(i + 'a'));
                    chars[i] --;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
    }
}
