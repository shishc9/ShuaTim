/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 22:47
 * @Auther:ShiShc
 */

/**
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 */

public class reverseWords {
    public String reverseWords(String s) {
        if(s.length() == 0) return "";
        s = s.trim();
        int j = s.length() - 1 , i = j;
        StringBuilder result = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i --;
            result.append(s.substring(i+1, j+1) + " ");
            while(i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

    }
}
