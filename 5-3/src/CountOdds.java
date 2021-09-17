/**
 * @date: 2021-5-11, 17:41
 * @author: ShiShc
 */

public class CountOdds {
    public int f(int low, int high) {
        int minus = high - low + 1;
        if(minus % 2 == 0) {
            return minus / 2;
        } else {
            return low % 2 == 0 ? minus / 2 : minus / 2 + 1;
        }
    }
}
