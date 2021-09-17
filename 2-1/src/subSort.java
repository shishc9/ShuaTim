/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 15:09
 * @Auther:ShiShc
 */

public class subSort {

    public static int[] subSort(int[] array) {
        if(array == null || array.length == 0) return new int[]{-1,-1};

        int last = -1, first = -1;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int length = array.length;
        for(int i = 0;i < length; ++i) {
            if(array[i] < max) {
                last = i;
            } else {
                max = Math.max(max, array[i]);
            }

            if(array[length-i-1] > min) {
                first = length - i - 1;
            } else {
                min = Math.min(min, array[length - i - 1]);
            }


        }

        return new int[] {first, last};
    }


    public static void main(String[] args) {

    }
}
