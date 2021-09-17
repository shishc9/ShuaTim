import java.util.Arrays;
import java.util.HashMap;

/**
 * @date: 2021-5-17, 09:24
 * @author: ShiShc
 */

public class CoinChange {
    int result = 0;

    public int f(int[] coins, int amount) {
        Arrays.sort(coins);
        while(amount != 0) {
            int temp = help(coins, amount);
            if(temp == -1) {
                result = -1;
                break;
            } else {
                amount -= temp;
            }
        }

        return result;
    }

    private int help(int[] coins, int amount) {
        result ++;
        for(int right = coins.length - 1; right >= 0; right--) {
            if(coins[right] <= amount) {
                return coins[right];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
       // System.out.println(new CoinChange().f(new int[]{1, 2, 5}, 11));

        HashMap<Integer, String> map = new HashMap<Integer, String>() {
            {
                put(1, "String");
                put(2, "String");
            }
        };

        System.out.println(map.get(3));
    }



}
