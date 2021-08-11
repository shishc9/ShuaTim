import java.util.LinkedList;
import java.util.Queue;

public class LC513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int result = 0;
        if(root != null) queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0;i < size;i ++) {
                TreeNode node = queue.poll();
                if(i == 0) {
                    result = node.val;
                }

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }

        return result;
    }
}
