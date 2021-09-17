/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 17:41
 * @Auther:ShiShc
 */

public class invertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    public static void main(String[] args) {

    }
}
