/**
 * @date: 2021-5-17, 09:11
 * @author: ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class IsCousins {

    int x;
    TreeNode xParent;
    int xDepth;
    boolean xFound = false;

    int y;
    TreeNode yParent;
    int yDepth;
    boolean yFound = false;

    public boolean f(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(root, 0, null);
        return xDepth == yDepth && xParent != yParent;
    }

    public void dfs(TreeNode node, int depth, TreeNode parent) {
        if(node == null) {
            return;
        }

        if(node.val == x) {
            xParent = parent;
            xDepth = depth;
            xFound = true;
        } else if(node.val == y) {
            yParent = parent;
            yDepth = depth;
            yFound = true;
        }

        if(xFound && yFound) {
            return;
        }
        dfs(node.left, depth + 1, node);
        if(xFound && yFound) {
            return;
        }
        dfs(node.right, depth + 1, node);
    }
}
