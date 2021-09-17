/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/21, 20:56
 * @Auther:ShiShc
 * 10. 正则表达式匹配
 */

public class isMatch {
    public static void main(String[] args) {

    }

    public static boolean isMatch(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();

        boolean[][] f = new boolean[sLength][pLength];
        f[0][0] = true;

        for(int i = 0;i < sLength; ++i) {
            for(int j = 0;j < pLength; ++j) {
                if(p.charAt(j-1) == '*') {
                    f[i][j] = f[i][j-2];
                }
            }
        }

        return true;
    }

}
