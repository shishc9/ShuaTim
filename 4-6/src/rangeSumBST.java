import java.util.ArrayList;
import java.util.List;

/**
 * @date: 2021-4-27, 09:23
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


public class rangeSumBST {
    public int f(TreeNode root,int low, int high) {
        if(root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        help(root, list);
        int sum = 0;
        for(int ele:list) {
            if(ele >= low && ele <= high) {
                sum += ele;
            }
        }

        return sum;
    }

    private void help(TreeNode node, List<Integer> list) {
        if(node == null) {
            return;
        }
        help(node.left, list);
        list.add(node.val);
        help(node.right, list);
    }
}
