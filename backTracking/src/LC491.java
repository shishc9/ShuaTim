import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LC491 {
    private List<List<Integer>> result = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        help(nums, 0);
        return result;
    }

    private void help(int[] nums, int startIndex) {
        if(startIndex > nums.length) {
            return ;
        }
        if(path.size() >= 2) {
            result.add(new LinkedList<>(path));
        }

        HashSet<Integer> dic = new HashSet<>();

        for(int i = startIndex;i < nums.length;i ++) {
            if((!path.isEmpty() && nums[i] < path.peekLast()) || dic.contains(nums[i])) {
                continue;
            }

            dic.add(nums[i]);
            path.add(nums[i]);
            help(nums, i + 1);
            path.pollLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC491().findSubsequences(new int[]{1,1,1,1,1,1,1,1}));
    }
}
