import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: ShiShc
 * @date: 2021/7/20
 * @Desc:
 */
public class LC18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;

//        if(length <= 3) {
//            return result;
//        }

        Arrays.sort(nums);

        for(int i = 0;i < length;i ++) {

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for(int j = i + 1;j < length;j ++) {

                if(nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1, right = length - 1;

                while(left < right) {
                    if(nums[i] + nums[j] + nums[left] + nums[right] == target) {
                        result.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
                        while(left < right && nums[left] == nums[left + 1]) left ++;
                        while(left < right && nums[right] == nums[right - 1]) right --;
                        left ++;
                        right --;
                    } else if(nums[i] + nums[j] + nums[left] + nums[right] < target) {
                        left ++;
                    } else if(nums[i] + nums[j] + nums[left] + nums[right] > target) {
                        right --;
                    }
                }

            }
        }


        return result;
    }
}
