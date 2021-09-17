import java.util.List;

/**
 * @date:2021-4-12, 20:21
 * @author:ShiShc
 */

class Node{
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int x) { val = x; }
    public Node(int x, List<Node> children) {val = x; this.children = children;}
}

public class maxDepth {
    int maxDepth = 0;
    public int f(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.children.isEmpty()) {
            return 1;
        }
        for(int i = 0;i < root.children.size(); i++) {
            maxDepth = Math.max(f(root.children.get(i)) + 1, maxDepth);
        }

        return maxDepth;
    }
}
