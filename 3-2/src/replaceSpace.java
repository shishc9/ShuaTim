/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 14:58
 * @Auther:ShiShc
 */

public class replaceSpace {
    public String replaceSpace(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') result.append("%20");
            else result.append(c);
        }

        return result.toString();
    }
}
