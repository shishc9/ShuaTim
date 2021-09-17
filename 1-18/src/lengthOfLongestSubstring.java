import java.util.HashSet;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/26, 14:33
 * @Auther:ShiShc
 */

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = s.length();
        int rp = -1, result = 0;

        for(int i = 0;i < length; ++ i) {
            if(i != 0) {
                set.remove(s.charAt(i-1));
            }
            while(rp+1 < length && !set.contains(s.charAt(rp+1))) {
                set.add(s.charAt(rp+1));
                ++rp;
            }

            result = Math.max(result, rp-i+1);
        }

        return result;
    }

}
