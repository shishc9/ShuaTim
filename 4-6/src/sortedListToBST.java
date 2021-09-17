/**
 * @date:2021-4-12, 12:03
 * @author:ShiShc
 */

class ListNode{
    int val;
    ListNode next;

    ListNode(int x) {val = x;}
}

public class sortedListToBST {
    public TreeNode f(ListNode head) {
        return help(head, null);
    }

    private TreeNode help(ListNode left, ListNode right) {
        if(left == right) {
            return null;
        }
        ListNode mid = getMedian(left, right);
        TreeNode root = new TreeNode(mid.val);
        root.left = help(left, mid);
        root.right = help(mid.next, right);
        return root;
    }

    private ListNode getMedian(ListNode left, ListNode right) {
        ListNode rabbit = left, turtle = left;
        while(rabbit != right && rabbit.next != right) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
}
