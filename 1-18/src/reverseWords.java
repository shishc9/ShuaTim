/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/30, 17:31
 * @Auther:ShiShc
 */

public class reverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world!  "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = strs.length-1; i >= 0; i --) {
            if(strs[i].equals("")) continue;
            result.append(strs[i] + " ");
        }

        return result.toString().trim();
    }

}
