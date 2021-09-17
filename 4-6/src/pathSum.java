import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @date:2021-4-12, 12:24
 * @author:ShiShc
 */

public class pathSum {
    List<List<Integer>> list = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<>();
    public List<List<Integer>> f(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return list;
    }

    public void dfs(TreeNode root, int targetSum) {
        if(root == null) {
            return;
        }

        path.addLast(root.val);
        targetSum -= root.val;
        if(root.left == null && root.right == null && targetSum == 0) {
            list.add(new LinkedList<>(path));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();
    }


}
