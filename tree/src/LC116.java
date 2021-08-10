import java.util.LinkedList;
import java.util.Queue;

public class LC116 {

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int val) {this.val = val;}

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();

        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            for(int i = queue.size();i > 0;i --) {
                Node node = queue.poll();
                Node nextNode = queue.peek();
                node.next = nextNode;
                if(i == 1) {
                    node.next = null;
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }

        return root;
    }
}
