import java.util.LinkedList;
import java.util.List;

public class LC39 {

    private List<List<Integer>> result = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTracking(candidates, target, 0, 0);
        return result;
    }

    private void backTracking(int[] candidates, int target, int startIndex, int tempSum) {
        if(tempSum > target) {
            return ;
        }
        if(tempSum == target) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i < candidates.length;i ++) {
            path.add(candidates[i]);
            backTracking(candidates, target, i, tempSum + candidates[i]);
            path.pollLast();
        }
    }
}
