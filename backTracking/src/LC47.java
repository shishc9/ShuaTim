import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC47 {

    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        help(nums, used);
        return result;
    }

    private void help(int[] nums, boolean[] used) {
        if(path.size() == nums.length) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = 0;i < nums.length;i ++) {
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if(used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            help(nums, used);
            path.pollLast();
            used[i] = false;
        }
    }
}
