import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 15:00
 * @Auther:ShiShc
 */

public class smallestK {

    public static int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];

        for(int i = 0;i < k; ++i) {
            result[i] = arr[i];
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
