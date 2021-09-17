class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int x) {
        this.val = x;
    }
    TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }
}

public class IsUnivalTree {
    public boolean f(TreeNode root) {
        if(root == null) {
            return true;
        }

        return help(root.left, root.val) && help(root.right, root.val);
    }

    private boolean help(TreeNode root, int x) {
        if(root == null) {
            return true;
        }

        return root.val == x && help(root.left, x) && help(root.right, x);
    }
}
