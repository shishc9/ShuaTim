import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 17:45
 * @Auther:ShiShc
 */

class Node{
    public int val;
    public List<Node> children;

    public Node() {};
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class postorder {
    
    void traverse(Node root, List<Integer> result) {
        if(root != null) {
            for(int i = 0;i < root.children.size(); ++i) {
                traverse(root.children.get(i), result);
            }
            result.add(root.val);
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        traverse(root, result);
        return result;
    }

    public static void main(String[] args) {

    }
}
