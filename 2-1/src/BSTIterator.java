import java.util.ArrayList;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/3, 9:46
 * @Auther:ShiShc
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

public class BSTIterator {

    ArrayList<Integer> array;
    int index;

    public BSTIterator(TreeNode root) {
        array = new ArrayList<Integer>();

        index = -1;

        InOrder(root);
    }

    public void InOrder(TreeNode root) {

        if(root == null) return;

        this.InOrder(root.left);
        this.array.add(root.val);
        this.InOrder(root.right);
    }



    public int next() {
        return this.array.get(++this.index);
    }

    public boolean hasNext() {
        return this.index + 1 < this.array.size();
    }


    public static void main(String[] args) {
    }
}
