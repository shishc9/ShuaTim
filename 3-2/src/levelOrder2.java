import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/21, 9:09
 * @Auther:ShiShc
 */

public class levelOrder2 {

    public static List<List<Integer>> levelOrder2(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root != null) queue.addLast(root);

        while(!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            for(int i = queue.size(); i > 0; -- i) {
                TreeNode node = queue.pollFirst();
                if(result.size() % 2 == 0) list.addLast(node.val);
                else list.addFirst(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            result.add(list);
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
