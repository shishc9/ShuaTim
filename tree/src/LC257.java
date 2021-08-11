import java.util.LinkedList;
import java.util.List;

public class LC257 {

    List<String> result = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return result;
        path.add(root.val);
        help(root);
        return result;
    }

    private void help(TreeNode node) {
        if(node.left == null && node.right == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0;i < path.size();i ++) {
                stringBuilder.append(path.get(i));
                if(i != path.size() - 1) {
                    stringBuilder.append("->");
                }
            }
            result.add(stringBuilder.toString());
        }

        if(node.left != null) {
            path.addLast(node.left.val);
            help(node.left);
            path.pollLast();
        }
        if(node.right != null) {
            path.addLast(node.right.val);
            help(node.right);
            path.pollLast();
        }
    }
}

