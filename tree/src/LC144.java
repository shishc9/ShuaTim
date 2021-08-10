import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LC144 {
    List<Integer> result = new LinkedList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()) {
            for(int size = stack.size(); size > 0; size --) {
                TreeNode temp = stack.pop();
                result.add(temp.val);
                if(temp.right != null) stack.add(temp.right);
                if(temp.left != null) stack.add(temp.left);
            }
        }

        return result;
    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//        preOrder(root);
//        return result;
//    }
//
//    private void preOrder(TreeNode node) {
//        if(node == null) {
//            return ;
//        }
//
//        result.add(node.val);
//        preOrder(node.left);
//        preOrder(node.right);
//    }

}
