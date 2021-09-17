import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @date: 2021-4-23, 10:31
 * @author: ShiShc
 */

public class largestDivisibleSubset {
    public List<Integer> f(int[] nums) {
        int length = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        if(length == 1) {
            list.add(nums[0]);
            return list;
        }
        Arrays.sort(nums);
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        int max = 0;
        int maxValue = 0;
        int pos = 0;
        for(int i = 1;i < length;i ++) {
            for(int j = i-1; j >= 0;j --) {
                if(nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(dp[i] > max) {
                max = dp[i];
                maxValue = nums[i];
                pos = i;
            }
        }


        for(int i = pos;max > 0;) {
            list.add(nums[i]);
            maxValue = nums[i];
            max --;
            while(!(maxValue % nums[i] == 0 && dp[i] == max) && max != 0) {
                i--;
            }
        }
        Collections.reverse(list);
        return list;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        System.out.println(new largestDivisibleSubset().f(nums));
    }
}
