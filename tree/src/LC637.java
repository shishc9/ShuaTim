import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC637 {

    List<Double> result = new LinkedList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);

        while(!queue.isEmpty()) {
            double temp = 0;
            int size = queue.size();
            for(int i = size; i > 0; i --) {
                TreeNode node = queue.poll();
                temp += node.val;
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(temp / size);
        }

        return result;
    }
}
