public class LC404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;

        int leftValue = sumOfLeftLeaves(root.left);
        int rightValue = sumOfLeftLeaves(root.right);

        int midValue = 0;
        if(root.left != null && root.left.left == null && root.left.right == null) {
            midValue = root.left.val;
        }

        return midValue + leftValue + rightValue;
    }


    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.left.left = new TreeNode(10)
//        System.out.println(new LC404().sumOfLeftLeaves());
    }
}
