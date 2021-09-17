import java.util.ArrayList;
import java.util.List;

/**
 * @date:2021-4-12, 16:26
 * @author:ShiShc
 */

public class maxPathSum {
    private int maxSum = Integer.MIN_VALUE;
    public int f(TreeNode root) {
        help(root);
        return maxSum;
    }

    public int help(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftMax = Math.max(help(node.left), 0);
        int rightMax = Math.max(help(node.right), 0);

        int nodeMax = node.val + leftMax + rightMax;

        maxSum = Math.max(maxSum, nodeMax);
        return node.val + Math.max(leftMax, rightMax);
    }


}
