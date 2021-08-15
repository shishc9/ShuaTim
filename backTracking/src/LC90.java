import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC90 {

    private List<List<Integer>> result = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        help(nums, 0, used);
        return result;
    }

    private void help(int[] nums, int startIndex, boolean[] used) {
        result.add(new LinkedList<>(path));
        if(startIndex >= nums.length) {
            return ;
        }

        for(int i = startIndex; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            help(nums, i + 1, used);
            path.pollLast();
            used[i] = false;
        }
    }


}
