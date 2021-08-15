import java.util.LinkedList;
import java.util.List;

public class LC78 {

    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        help(nums, 0);
        return result;
    }

    private void help(int[] nums, int startIndex) {
        result.add(new LinkedList<>(path));
        if(startIndex >= nums.length) {
            return ;
        }

        for(int i = startIndex;i < nums.length;i ++) {
            path.add(nums[i]);
            help(nums, i + 1);
            path.pollLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC78().subsets(new int[]{1, 2, 3}));
    }
}
