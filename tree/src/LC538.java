public class LC538 {
    private int pre = 0;

    void help(TreeNode root) {
        if(root == null) return;
        help(root.right);
        root.val += pre;
        pre = root.val;
        help(root.left);
    }


    public TreeNode convertBST(TreeNode root) {
        help(root);
        return root;
    }
}
