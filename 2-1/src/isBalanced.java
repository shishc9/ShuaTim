/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/20, 18:32
 * @Auther:ShiShc
 */

public class isBalanced {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }

    private int depth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
