/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 23:17
 * @Auther:ShiShc
 */

/**
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 2 2
 * 2
 */

public class search {
    public static int search(int[] nums, int target) {

        return helper(nums, target+1) - helper(nums, target);
//        int left = 0, right = nums.length - 1;
//        int pos = -1;
//        while(left <= right) {
//            int mid = left + (right - left) / 2;
//            if(nums[mid] == target) {
//                pos = mid;
//                break;
//            } else if(nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }

//        if(pos == -1) return 0;
//        int sum = 0;
//        for(int i = pos; i >= 0 && nums[i] == target; i--) {
//            sum ++;
//        }
//        return sum;
    }

    private static int helper(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = (right + left) / 2;
            if(arr[mid] >= target) right--;
            else left ++;
        }

        return right;
    }



    public static void main(String[] args) {
        System.out.println(search(new int[]{5,7,7,8,8,10}, 8));
        System.out.println(search(new int[]{2,2}, 2));
    }
}
