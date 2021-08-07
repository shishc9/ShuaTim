/**
 * @author: ShiShc
 * @date: 2021/7/26
 * @Desc:
 */
public class Main {
    String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < numRows;i ++) {
            int step = 2 * (numRows - i - 1);
            int index = i;
            while(index < s.length()) {
                result.append(s.charAt(index));
                index += step;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.convert("PAYPALISHIRING", 3));
    }
}
