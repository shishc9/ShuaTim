/**
 * @date:2021/4/6, 18:36
 * @author:ShiShc
 */

public class Test03 {

    private static int count;

    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int i = left, j = right, key = arr[i];
            while(i < j) {
                while(i < j) {
                    count++;
                    if(arr[j] > key) {
                        j--;
                    } else {
                        break;
                    }
                }
                if(i < j) {
                    arr[i++] = arr[j];
                }
                while(i < j) {
                    count++;
                    if(arr[i] < key) {
                        i++;
                    } else {
                        break;
                    }
                }
                if(i < j) {
                    arr[j--] = arr[i];
                }
            }

            arr[i] = key;
            quickSort(arr, left, i-1);
            quickSort(arr, i+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3,3,3,3,3,3,3};
        int[] arr2 = {4,1,3,2,6,5,7};
        int[] arr3 = {1,2,3,4,5,6,7};
        count = 0;
        quickSort(arr1, 0, arr1.length-1);
        System.out.println("{3,3,3,3,3,3,3} count = " + count);
        count = 0;
        quickSort(arr2, 0, arr2.length-1);
        System.out.println("{4,1,3,2,6,5,7} count = " + count);
        count = 0;
        quickSort(arr3, 0, arr3.length-1);
        System.out.println("{1,2,3,4,5,6,7} count = " + count);
    }
}
