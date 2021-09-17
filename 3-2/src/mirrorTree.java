
/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/7, 15:36
 * @Auther:ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {val = x;}
}


public class mirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;
    }

    public static void main(String[] args) {

    }
}
