/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 23:01
 * @Auther:ShiShc
 */

/**
 * 输入：[3,4,5,1,2]
 * 输出：1
 */

public class minArray {
    public static int minArray(int[] numbers) {
//        quickSort(numbers, 0, numbers.length-1);
//        return numbers[0];
        int left = 0, right = numbers.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(numbers[mid] > numbers[right]) {
                left = mid+1;
            } else if(numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right = right - 1;
            }
        }

        return numbers[left];
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int i = left, j = right, key = arr[i];
            while(i < j) {
                while(i < j && arr[j] > key) j--;
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
        System.out.println(minArray(new int[]{3,4,5,1,2}));
    }
}
