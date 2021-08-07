import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: ShiShc
 * @date: 2021/7/20
 * @Desc:
 */
public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int length = nums.length;

        if(length <= 2) {
            return result;
        }

        Arrays.sort(nums);

        for(int i = 0;i < nums.length - 2;i ++) {

            if(nums[i] > 0) {
                return result;
            }

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for(int left = i + 1, right = nums.length - 1;left < right;) {
                if(nums[left] + nums[right] == - nums[i]) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left + 1] == nums[left]) left ++;
                    while(left < right && nums[right] == nums[right - 1]) right --;
                    left ++;
                    right --;
                } else if(nums[left] + nums[right] < - nums[i]) {
                    left ++;
                } else if(nums[left] + nums[right] > - nums[i]) {
                    right --;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC15().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
