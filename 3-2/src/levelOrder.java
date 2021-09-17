import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/21, 8:41
 * @Auther:ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {val = x;}

}

public class levelOrder {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        List<List<Integer>> result = new ArrayList<>();

        while(!queue.isEmpty()) {
            ArrayList<Integer> tempElement = new ArrayList<>();
            for(int i = queue.size(); i > 0; --i) {
                TreeNode temp = queue.pollFirst();
                tempElement.add(temp.val);
                if(temp.left != null) queue.addLast(temp.left);
                if(temp.right != null) queue.addLast(temp.right);
            }

            result.add(tempElement);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
