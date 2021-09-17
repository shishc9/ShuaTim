/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/20, 12:26
 * @Auther:ShiShc
 */

public class lowestCommonAncestor {

    TreeNode result;

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return false;

        boolean leftSon = dfs(root.left, p, q);
        boolean rightSon = dfs(root.right, p, q);

        if((leftSon&&rightSon) || (root.val == p.val || root.val == q.val) && (leftSon || rightSon)) {
            result = root;
        }

        return leftSon || rightSon || (root.val == p.val || root.val == q.val);
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.result;
    }


    public static void main(String[] args) {

    }
}
