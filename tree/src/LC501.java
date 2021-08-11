import java.util.ArrayList;
import java.util.List;

public class LC501 {

    private int count = 0;
    private int maxCount = 0;
    private List<Integer> result = new ArrayList<>();
    private TreeNode pre = null;

    public int[] findMode(TreeNode root) {
        help(root);
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    private void help(TreeNode root) {
        if(root == null) return ;

        help(root.left);

        if(pre == null) {
            count = 1;
        } else if(pre.val == root.val) {
            count ++;
        } else {
            count = 1;
        }
        pre = root;

        if(count == maxCount) {
            result.add(root.val);
        } else if(count > maxCount) {
            result.clear();
            maxCount = count;
            result.add(root.val);
        }
        help(root.right);
    }
}
