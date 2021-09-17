/**
 * @date: 2021-5-14, 09:02
 * @author: ShiShc
 */

public class IntToRoman {
    String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    Integer[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public String f(int num) {
        StringBuilder result = new StringBuilder();
        for(int i = nums.length - 1; i >= 0; i--) {
            while(num >= nums[i]) {
                num -= nums[i];
                result.append(symbols[i]);
            }

            if(num == 0) break;
        }

        return result.toString();
    }
}
