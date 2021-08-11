public class LC110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftDepth = help(root.left);
        int rightDepth = help(root.right);

        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int help(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = help(root.left);
        int rightDepth = help(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
