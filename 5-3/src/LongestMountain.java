/**
 * @date: 2021-5-16, 09:48
 * @author: ShiShc
 */

public class LongestMountain {
    public int f(int[] arr) {
        int MIN_LENGTH = 3;
        int result = 0;
        if(MIN_LENGTH > arr.length) {
            return result;
        }

        for(int i = 1;i < arr.length - 1;i ++) {
            int left = i, right = i;
            while(left >= 1 && arr[left - 1] < arr[left]) {
                left --;
            }
            while(right < arr.length - 1 && arr[right] > arr[right + 1]) {
                right ++;
            }
            result = Math.max(right - left + 1, result);
        }

        return result;
    }
}
