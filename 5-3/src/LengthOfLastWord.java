/**
 * @date: 2021-5-12, 11:22
 * @author: ShiShc
 */

public class LengthOfLastWord {
    public int f(String s) {
        s = s.trim();
        int pos = s.length() - 1;
        int count = 0;
        while (s.charAt(pos --) != ' ') {
            count ++;
        }

        return count;
    }
}
