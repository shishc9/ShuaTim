import java.util.LinkedList;
import java.util.List;

public class LC46 {

    private List<List<Integer>> result = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        help(nums, used);
        return result;
    }

    private void help(int[] nums, boolean[] used) {
        if(nums.length == path.size()) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = 0;i < nums.length;i ++) {
            if(used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            help(nums, used);
            path.pollLast();
            used[i] = false;
        }
    }
}
