import java.util.LinkedList;
import java.util.List;

public class LC216 {

    private List<List<Integer>> result = new LinkedList<>();
    private LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k, n, 1, 0);
        return result;
    }

    private void backTracking(int k, int n, int startIndex, int tempSum) {
        if(path.size() == k) {
            if(tempSum == n) {
                result.add(new LinkedList<>(path));
                return ;
            }
        }

        for(int i = startIndex;i <= 9;i ++) {
            path.add(i);
            backTracking(k, n, i + 1, tempSum + i);
            path.pollLast();
        }
    }
}
