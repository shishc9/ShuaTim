/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/20, 18:45
 * @Auther:ShiShc
 */

public class countLevel {

    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }


    public static void main(String[] args) {

    }
}
