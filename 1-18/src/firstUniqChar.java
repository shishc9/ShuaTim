import java.util.HashMap;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/25, 17:58
 * @Auther:ShiShc
 */

public class firstUniqChar {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
        System.out.println(firstUniqChar(""));
    }

    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        for(char c:s.toCharArray()) {
            map.put(c, !map.containsKey(c));
        }
        for(char c:s.toCharArray()) {
            if(map.get(c)) return c;
        }

        return ' ';
    }

}
