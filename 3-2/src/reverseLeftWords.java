/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 22:55
 * @Auther:ShiShc
 */

/**
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 */

public class reverseLeftWords {
    public String reverseLeftWord(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
