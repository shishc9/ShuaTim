
/**
 * @date:2021-4-11, 23:08
 * @author:ShiShc
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {val = x;}
}

public class isValidBST {
    public boolean f(TreeNode root) {
        return help(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean help(TreeNode node, Long leftV, Long rightV) {
        if(node == null) {
            return true;
        }
        if(node.val <= leftV || node.val >= rightV) {
            return false;
        }
        //return help(node.left, leftV, node.val) && help(node.right, node.val, rightV);
        return true;
    }
}
