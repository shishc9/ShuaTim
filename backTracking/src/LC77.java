import java.util.LinkedList;
import java.util.List;

public class LC77 {

    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return result;
    }

    private void backTracking(int n, int k, int startIndex) {
        if(path.size() == k) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i <= n;i ++) {
            path.add(i);
            backTracking(n, k, i + 1);
            path.pollLast();
        }
    }
}
