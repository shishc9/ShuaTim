import java.util.List;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 15:07
 * @Auther:ShiShc
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}

public class reversePrint {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while(head != null) {
            stack.push(head);
            head = head.next;
        }

        int size = stack.size();
        int[] result = new int[size];

        for(int i = 0; i < size; ++i) {
            result[i] = stack.pop().val;
        }

        return result;
    }


}
