import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC40 {

    private List<List<Integer>> result = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backTracking(candidates, target, 0, 0, used);
        return result;
    }

    private void backTracking(int[] candidates, int target, int startIndex, int tempSum, boolean[] used) {
        if(tempSum > target) {
            return ;
        }
        if(tempSum == target) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i < candidates.length;i ++) {
            if(i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == false) {
                continue;
            }
            path.add(candidates[i]);
            used[i] = true;
            backTracking(candidates, target, i + 1, tempSum + candidates[i], used);
            used[i] = false;
            path.pollLast();
        }
    }
}
