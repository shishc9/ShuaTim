/**
 * @date: 2021-5-18, 14:37
 * @author: ShiShc
 */

public class Main {
    public double f(int N) {
        double result = 0;
        if(N <= 0) {
            return result;
        }
        for(int i = 1;i <= N;i ++) {
            result += 1.0 / i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Main().f(3));
    }
}
