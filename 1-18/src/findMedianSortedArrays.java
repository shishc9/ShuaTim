/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/19, 14:38
 * @Auther:ShiShc
 * 4. 寻找两个正序数组的中位数
 */

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {3,5,9,10};
        int[] arr2 = {1,4,7,9};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];

        if(len1 == 0) {
            if(len2 % 2 == 0) {
                return (arr2[len2/2 - 1] + arr2[len2 / 2]) / 2.0;
            } else {
                return arr2[len2 / 2];
            }
        }
        if(len2 == 0) {
            if(len1 % 2 == 0) {
                return (arr1[len1/2 - 1] + arr1[len1 / 2]) / 2.0;
            } else {
                return arr1[len1 / 2];
            }
        }

        int count = 0;
        int i = 0, j = 0;

        while(count != (len1 + len2)) {
            if(i == len1) {
                while(j != len2) {
                    arr[count++] = arr2[j++];
                }
                break;
            }
            if(j == len2) {
                while(i != len1) {
                    arr[count++] = arr1[i++];
                }
                break;
            }

            if(arr1[i] < arr2[j]) {
                arr[count++] = arr1[i++];
            } else {
                arr[count++] = arr2[j++];
            }
        }

        if( count % 2 == 0) {
            return (arr[count/2 - 1] + arr[count/2]) / 2.0;
        } else {
            return arr[count/2];
        }

    }
}
