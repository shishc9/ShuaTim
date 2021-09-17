import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 17:05
 * @Auther:ShiShc
 */

public class maxDepth {

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if(root == null) return 0;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<TreeNode> temp;
        int result = 0;
        while (!queue.isEmpty()) {
            temp = new LinkedList<>();
            for(TreeNode node:queue) {
                if(node.left != null) temp.add(node.left);
                if(node.right != null) temp.add(node.right);
            }

            queue = temp;
            result ++;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
