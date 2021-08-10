import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC515 {

    List<Integer> result = new LinkedList<>();

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if(root != null) {
            queue.add(root);
        }

        while(!queue.isEmpty()) {
            int maxValue = Integer.MIN_VALUE;
            for(int size = queue.size();size > 0;size --) {
                TreeNode node = queue.poll();
                maxValue = Math.max(maxValue, node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(maxValue);
        }

        return result;
    }
}
