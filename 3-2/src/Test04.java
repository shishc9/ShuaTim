/**
 * @date:2021/4/6, 19:32
 * @author:ShiShc
 */

public class Test04 {
    private static int find(int[] arr1, int[] arr2, int left1, int left2, int right1, int right2, int k) {
        int am = (left1 + right1) / 2;
        int bm = (left2 + right2) / 2;
        if(left1 > right1) {
            return arr2[k + left2 - 1];
        }
        if(left2 > right1) {
            return arr1[k + left1 - 1];
        }
        if(arr1[am] > arr2[bm]) {
            if(k <= am - left1 + bm - left2 + 1) {
                return find(arr1, arr2, left1, left2, right1, bm - 1, k);
            } else {
                return find(arr1, arr2, am + 1, left2, right1, right2, k - (am - left1 + 1));
            }
        } else {
            if(k <= am - left1 + bm - left2 + 1) {
                return find(arr1, arr2, left1, left2, am - 1, right2, k);
            } else {
                return find(arr1, arr2, left1, bm+1, right1, right2, k - (bm - left2 + 1));
            }
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {9,7,5,3,1};
        int[] arr2 = {10,8,6,4,2};
        System.out.println(find(arr1, arr2, 0, 0, arr1.length -1, arr2.length-1, 3));
        System.out.println(find(arr1, arr2, 0, 0, arr1.length -1, arr2.length-1, 5));
    }
}
