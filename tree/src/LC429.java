import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC429 {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root != null) {
            queue.add(root);
        }

        while(!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            for(int i = queue.size();i > 0;i --) {
                Node node = queue.poll();
                list.add(node.val);
                for(int j = 0;j < node.children.size();j ++) {
                    if(node.children.get(j) != null) {
                        queue.add(node.children.get(j));
                    }
                }
            }
            result.add(new LinkedList<>(list));
        }

        return result;
    }
}
