/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/24, 11:44
 * @Auther:ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {val = x;}

}

public class preOrder {

    public void preOrder(TreeNode root) {
        if(root == null)  return;

        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {

    }
}
