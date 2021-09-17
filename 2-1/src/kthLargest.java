/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/20, 12:17
 * @Auther:ShiShc
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}



public class kthLargest {

    int result, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inorderTraversal(root);
        return result;
    }

    void inorderTraversal(TreeNode root) {
        if(root == null) return;

        inorderTraversal(root.right);
        if(k == 0) return;
        if(--k == 0) result = root.val;
        inorderTraversal(root.left);
    }


    public static void main(String[] args) {

    }
}
