/**
 * @date: 2021-5-18, 09:34
 * @author: ShiShc
 */

public class CountTriplets {
    public int f(int[] arr) {
        int n = arr.length;
        int[] s = new int[n + 1];
        for(int i = 0;i < n;i ++) {
            s[i+1] = s[i] ^ arr[i];
        }
        int result = 0;
        for(int i = 0;i < n;i ++) {
            for(int k = i+1;k < n;k ++) {
                if(s[i] == s[k+1]) {
                    result += k - i;
                }
            }
        }

        return result;
    }
}
