import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 13:52
 * @Auther:ShiShc
 */

public class postorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        postorder(result, root);
        return result;
    }

    private void postorder(List<Integer> result, TreeNode root) {
        if(root == null) {
            return;
        }

        postorder(result, root.left);
        postorder(result, root.right);
        result.add(root.val);
    }


    public static void main(String[] args) {

    }
}
