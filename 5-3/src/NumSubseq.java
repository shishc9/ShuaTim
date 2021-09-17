import java.util.Arrays;

public class NumSubseq {

    int sum = 0;

    public int f(int[] nums, int target) {
        Arrays.sort(nums);

        for(int left = 0; left < nums.length; left ++) {
            int right = nums.length - 1;
            while(right >= 0 && right > left && nums[left] + nums[right] > target) {
                right --;
            }

            if(right - left > 1) {
                sum += Math.pow(2, right - left - 1) - 1 + 2 + (right - left - 1);
            } else if(right - left == 1) {
                sum += 2;
            } else {
                if(nums[right] * 2 <= target) {
                    sum ++;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new NumSubseq().f(new int[]{3, 5, 6, 7}, 9));
    }
}
