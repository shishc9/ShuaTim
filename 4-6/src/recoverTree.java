import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date: 2021-4-24, 10:11
 * @author: ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int x) {this.val = x;}
    TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }
}

public class recoverTree {
    public void f(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return ;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        inorder(root, list);
        int[] pos = help(list);
        swap(pos, root, 2);
        return;
    }

    private void inorder(TreeNode root, List<TreeNode> list) {
        if(root == null) {
            return ;
        }

        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }

    private int[] help(List<TreeNode> list) {
        int p1 = -1, p2 = -1;
        for(int i = 0;i < list.size();i ++) {
            if(list.get(i).val > list.get(i+1).val) {
                p2 = list.get(i+1).val;
                if(p1 == -1) {
                    p1 = list.get(i).val;
                } else {
                    break;
                }
            }
        }

        return new int[] {p1, p2};
    }

    private void swap(int[] pos, TreeNode root, int count) {
        int x = pos[0], y = pos[1];
        if(root != null) {
            if(root.val == x || root.val == y) {
                root.val = root.val == x ? y : x;
                if(--count == 0) {
                    return ;
                }
            }

            swap(pos, root.right, count);
            swap(pos, root.left, count);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        new recoverTree().f(root);
    }
}
