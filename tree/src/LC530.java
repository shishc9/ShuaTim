public class LC530 {

    int result = Integer.MAX_VALUE;
    TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        help(root);
        return result;
    }

    private void help(TreeNode root) {
        if(root == null) return ;
        help(root.left);
        if(pre != null) {
            result = Math.min(result, root.val - pre.val);
        }
        pre = root;
        help(root.right);
    }
}
