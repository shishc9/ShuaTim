public class LC112 {

    boolean flag = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        help(root, targetSum, 0);
        return flag;
    }

    private void help(TreeNode node, int target, int currentSum) {
        currentSum += node.val;

        if(currentSum == target && node.left == null && node.right == null) {
            flag = true;
            return;
        }

        if(node.left != null) {
            help(node.left, target, currentSum);
        }
        if(node.right != null) {
            help(node.right, target, currentSum);
        }
    }
}
