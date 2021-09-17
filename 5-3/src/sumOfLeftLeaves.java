class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 * @date: 2021-5-12, 11:26
 * @author: ShiShc
 */

public class sumOfLeftLeaves {

    public int f(TreeNode root) {
        return root == null ? 0 : help(root);
    }

    private int help(TreeNode node) {
        int result = 0;
        if(node.left != null) {
            result += isLeafNode(node.left) ? node.left.val : help(node.left);
        }
        if(node.right != null && !isLeafNode(node.right)) {
            result += help(node.right);
        }

        return result;
    }

    private boolean isLeafNode(TreeNode node) {
        return node.right == null && node.left == null;
    }
}
