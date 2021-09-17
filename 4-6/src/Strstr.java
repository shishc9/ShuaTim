/**
 * @date: 2021-4-20, 21:10
 * @author: ShiShc
 */

public class Strstr {
    public int strStr(String hayStack, String needle) {
        return hayStack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(new Strstr().strStr("hello", "ll"));
    }
}
