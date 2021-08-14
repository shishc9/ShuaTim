public class LC235 {
    public TreeNode lowestCommonAncestor(TreeNode cur, TreeNode p, TreeNode q) {
        if(cur == null) return cur;

        if(cur.val > p.val && cur.val > q.val) {
            TreeNode left = lowestCommonAncestor(cur.left, p, q);
            if(left != null) {
                return left;
            }
        }

        if(cur.val < p.val && cur.val < q.val) {
            TreeNode right = lowestCommonAncestor(cur.right, p, q);
            if(right != null) {
                return right;
            }
        }

        return cur;
    }
}
