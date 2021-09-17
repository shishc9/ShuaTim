/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 15:16
 * @Auther:ShiShc
 */

public class findKth {

    public int findKth(int[] a, int n, int K) {
        quickSort(a, 0, n-1);
        return a[K-1];
    }

    private void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int i = left, j = right, key = arr[i];
            while(i < j) {
                while(i < j && arr[j] >= key) j --;
                if(i < j) arr[i++] = arr[j];
                while(i < j && arr[i] < key) i++;
                if(i < j) arr[j--] = arr[i];
            }

            arr[i] = key;
            quickSort(arr, left, i-1);
            quickSort(arr, i+1, right);
        }
    }

    public static void main(String[] args) {

    }
}
