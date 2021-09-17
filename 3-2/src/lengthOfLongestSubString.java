/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 10:54
 * @Auther:ShiShc
 */

import java.util.HashMap;

/**
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 *     请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 */
public class lengthOfLongestSubString {
    public static int longestSubString (String s) {
        if(s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;
        for(int i = 0;i < s.length();i ++) {
            if(map.containsKey(s.charAt(i))) {
                left = Math.max(map.get(s.charAt(i)) + 1, left);
            }
            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(longestSubString("pwwkew"));  //3
        System.out.println(longestSubString("abcabcbb")); //3
        System.out.println(longestSubString("abba")); //1
    }
}
