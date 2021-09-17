/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/20, 12:49
 * @Auther:ShiShc
 */

public class convertBiNode {

    TreeNode head = new TreeNode(-1);
    TreeNode perv = null;

    public TreeNode convertBiNode(TreeNode root) {
        helper(root);
        return head.right;
    }

    private void helper(TreeNode root) {
        if(root == null) return ;
        helper(root.left);
        if(perv == null) {
            perv = root;
            head.right = root;
        } else {
            perv.right = root;
            perv = root;
        }
        root.left = null;
        helper(root.right);
    }

    public static void main(String[] args) {

    }
}
