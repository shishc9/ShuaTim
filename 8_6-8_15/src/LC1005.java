import java.util.Arrays;

public class LC1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        for(int i = 0;i < nums.length;i ++) {
            if(nums[i] < 0 && k > 0) {
                nums[i] *= -1;
                k --;
            }
        }

        int result = 0;
        if(k > 0) {
            Arrays.sort(nums);
            if(k % 2 == 1) {
                nums[0] *= -1;
            }
        }

        for(int num : nums) {
            result += num;
        }

        return result;
    }
}
