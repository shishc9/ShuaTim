import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC199 {

    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.add(root);
        }

        while(!queue.isEmpty()) {
            for(int size = queue.size();size > 0;size --) {
                TreeNode node = queue.poll();
                if(size == 1) {
                    result.add(node.val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }

        return result;
    }
}
