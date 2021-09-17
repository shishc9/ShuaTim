import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 14:45
 * @Auther:ShiShc
 */

public class firstUniqChar {
    public char firstUniqChar(String s) {
        if(s == null || s.length() == 0) return ' ';

        HashMap<Character, Boolean> dic = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(dic.containsKey(c)) {
                dic.put(c, true);
                continue;
            }
            dic.put(c, false);
        }

        for(char c : s.toCharArray()) {
            if(!dic.get(c)) {
                return c;
            }
        }

        return ' ';
    }
}
