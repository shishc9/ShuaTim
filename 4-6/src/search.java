/**
 * @date:2021/4/7, 21:25
 * @author:ShiShc
 */

public class search {
    public boolean search(int[] nums, int target) {
        if(nums.length == 0) {
            return false;
        }
        if(nums.length == 1) {
            return nums[0] == target;
        }

        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return true;
            }
            if(nums[left] == nums[mid] && nums[right] == nums[mid]) {
                left++;
                right--;
            } else if(nums[mid] >= nums[left]) {
                if(target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        search search = new search();
        System.out.println(search.search(nums, 2));
    }
}
