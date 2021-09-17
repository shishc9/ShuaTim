/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 15:54
 * @Auther:ShiShc
 */

public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        int[] result = new int[k];
        for(int i = 0;i < k; i ++) {
            result[i] = arr[i];
        }
        return result;
    }

    public void quickSort (int[] arr, int left, int right) {
        if(left < right) {
            int i = left, j = right, key = arr[i];
            while(i < j) {
                while(i < j && arr[j] > key) j--;
                if(i < j) {
                    arr[i] = arr[j];
                    i ++;
                }
                while(i < j && arr[i] < key) i++;
                if(i < j) {
                    arr[j] = arr[i];
                    j --;
                }
            }

            arr[i] = key;
            quickSort(arr, left, i-1);
            quickSort(arr, i+1, right);
        }
    }
}
