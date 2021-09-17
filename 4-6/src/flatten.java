import java.util.ArrayList;
import java.util.List;

/**
 * @date:2021-4-12, 15:53
 * @author:ShiShc
 */

public class flatten {
    public void f(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preTraversal(root, list);
        int size = list.size();
        for(int i = 1; i < size;i ++) {
            TreeNode prev = list.get(i-1), curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

    private void preTraversal(TreeNode root, List<TreeNode> list) {
        if(root != null) {
            list.add(root);
            preTraversal(root.left, list);
            preTraversal(root.right, list);
        }
    }
}
