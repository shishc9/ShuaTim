import java.util.*;

public class LC102 {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if(root != null) queue.add(root);

        while(!queue.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            for(int size = queue.size();size > 0;size --) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            result.add(new LinkedList<>(list));
        }

        Collections.reverse(result);

        return result;
    }
}
