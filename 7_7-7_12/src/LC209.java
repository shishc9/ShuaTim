public class LC209 {
    int minSubArrayLen(int s, int[] nums) {
        int windowSum = 0;
        int start = 0;
        int result = Integer.MAX_VALUE;
        int windowLength = 0;
        for(int j = 0;j < nums.length;j ++) {
            windowSum += nums[j];
            while(windowSum >= s) {
                windowLength = (j - start + 1);
                result = Math.min(result, windowLength);
                windowSum -= nums[start++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
