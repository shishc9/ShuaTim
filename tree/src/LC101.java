import java.util.LinkedList;
import java.util.Queue;

public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if(node1 == null && node2 == null) {
                continue;
            }

            if(node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }

            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }

        return true;
    }


//    public boolean isSymmetric(TreeNode root) {
//        return help(root.left, root.right);
//    }
//
//    private boolean help(TreeNode left, TreeNode right) {
//        if(left == null && right == null) return true;
//        else if(left == null || right == null || left.val != right.val) return false;
//
//        boolean outside = help(left.left, right.right);
//        boolean inside = help(left.right, right.left);
//        return outside && inside;
//    }
}
