import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 16:54
 * @Auther:ShiShc
 */

public class preorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        preorder(result, root);
        return result;
    }

    private void preorder(List<Integer> result, TreeNode root) {
        if(root == null) return;

        result.add(root.val);
        preorder(result, root.left);
        preorder(result, root.right);
    }



    public static void main(String[] args) {

    }
}
