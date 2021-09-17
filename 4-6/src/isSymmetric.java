/**
 * @date: 2021-4-24, 11:07
 * @author: ShiShc
 */

public class isSymmetric {
    public boolean f(TreeNode root) {
        return help(root, root);
    }

    private boolean help(TreeNode p, TreeNode q) {
        if(q == null && p == null) {
            return true;
        }
        if(q == null || p == null) {
            return false;
        }

        return p.val == q.val && help(p.left, q.right) && help(p.right, q.left);
    }
}
