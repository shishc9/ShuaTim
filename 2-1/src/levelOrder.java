import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/20, 12:37
 * @Auther:ShiShc
 */

public class levelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> result = new ArrayList<>();

        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = queue.size(); i > 0; --i) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            result.add(temp);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
