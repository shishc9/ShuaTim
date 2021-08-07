public class LC45 {
    public int jump(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }

        int result = 0;
        int curCover = 0;
        int nextCover = 0;

        for(int i = 0;i < nums.length;i ++) {
            nextCover = Math.max(nextCover, nums[i] + i);
            if(curCover == i) {
                if(curCover != nums.length - 1) {
                    result ++;
                    curCover = nextCover;
                    if(nextCover >= nums.length - 1) break;
                } else {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC45().jump(new int[]{2, 3, 1, 1, 4}));
    }
}
