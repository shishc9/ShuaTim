import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 13:47
 * @Auther:ShiShc
 */

public class inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inorder(result, root);
        return result;
    }

    private void inorder(List<Integer> result, TreeNode root) {
        if(root == null) {
            return;
        }

        inorder(result, root.left);
        result.add(root.val);
        inorder(result, root.right);
    }



    public static void main(String[] args) {

    }
}
