public class LC376 {
    public int wiggleMaxLength(int[] nums) {
        int result = 1;
        int currentDiff = 0;
        int preDiff = 0;

        for(int i = 0;i < nums.length - 1;i ++) {
            currentDiff = nums[i + 1] - nums[i];
            if((currentDiff > 0 && preDiff <= 0) || (preDiff >= 0 && currentDiff < 0)) {
                result ++;
                preDiff = currentDiff;
            }
        }

        return result;
    }
}
