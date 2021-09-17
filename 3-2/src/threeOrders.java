import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 14:47
 * @Auther:ShiShc
 */

class TreeNode {
      int val;
      TreeNode right;
      TreeNode left;

      TreeNode(int x) {val = x;}
}

public class threeOrders {

    public int[][] threeOrders (TreeNode root) {
        ArrayList<Integer> result1 = new ArrayList<>();
        preOrder(root, result1);
        int[][] result = new int[3][result1.size()];
        for(int index = 0; index < result1.size(); ++ index) {
            result[0][index] = result1.get(index);
        }
        result1.clear();
        preOrder(root, result1);
        for(int index = 0; index < result1.size(); ++ index) {
            result[1][index] = result1.get(index);
        }
        result1.clear();
        preOrder(root, result1);
        for(int index = 0; index < result1.size(); ++ index) {
            result[2][index] = result1.get(index);
        }

        return result;
    }

    private void preOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return ;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    private void inOrder(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return ;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    private void help(TreeNode root, ArrayList<Integer> list) {
        if(root == null) return ;
        help(root.left, list);
        help(root.right, list);
        list.add(root.val);
    }

}
