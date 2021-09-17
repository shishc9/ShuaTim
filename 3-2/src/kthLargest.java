/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/7, 15:52
 * @Auther:ShiShc
 */

public class kthLargest {
    public static void main(String[] args) {

    }

    private int result, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return result;
    }

    private void helper(TreeNode root) {
        if(root == null) return ;

        helper(root.right);
        if(k == 0) return;
        if(--k == 0) result = root.val;
        helper(root.left);
    }

}
