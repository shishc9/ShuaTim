/**
 * @date: 2021-5-14, 09:28
 * @author: ShiShc
 */

public class SortArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if(left < right) {
            int i = left, j = right, key = nums[i];
            while(i < j) {
                while(i < j && nums[j] > key) j--;
                if(i < j) nums[i++] = nums[j];
                while(i < j && nums[i] < key) i++;
                if(i < j) nums[j--] = nums[i];
            }

            nums[i] = key;
            quickSort(nums, left, i - 1);
            quickSort(nums, i + 1, right);
        }
    }
}
