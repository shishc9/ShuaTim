/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/21, 9:49
 * @Auther:ShiShc
 */

public class searchBST {

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;

        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }


    public static void main(String[] args) {

    }
}
