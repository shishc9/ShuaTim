/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/7, 15:45
 * @Auther:ShiShc
 */

public class maxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if(null == root) return 0;

        return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;
    }
}
