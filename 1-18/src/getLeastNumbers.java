import java.util.Arrays;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 13:46
 * @Auther:ShiShc
 */

public class getLeastNumbers {

    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        Arrays.sort(arr);

        for(int i = 0;i < k; ++i) {
            result[i] = arr[i];
        }

        return result;

    }

    public static void main(String[] args) {
        int[] array = {4,5,1,6,2,7,3,8};
        int[] result = getLeastNumbers(array, 4);
        for(int i = 0;i < result.length; ++i) {
            System.out.println(result[i]);
        }
    }

}
