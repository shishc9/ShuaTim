import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 21:41
 * @Auther:ShiShc
 */

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.next = null;
        this.random = null;
        this.val = val;
    }
}

public class copyRandomList {
    public static void main(String[] args) {

    }

    public static Node copyRandomList(Node head) {
        if(head == null) return null;
        Node pos = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (pos != null) {
            map.put(pos, new Node(pos.val));
            pos = pos.next;
        }

        pos = head;

        while(pos != null) {
            map.get(pos).next = map.get(pos.next);
            map.get(pos).random = map.get(pos.random);
            pos = pos.next;
        }

        return map.get(head);
    }



}
