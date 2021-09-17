import java.util.List;

/**
 * @date: 2021-4-23, 18:53
 * @author: ShiShc
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int x) {this.val = x;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class mergeTwoLists {
    public ListNode f(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        ListNode head = new ListNode();
        ListNode temp = head;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 == null ? l2 : l1;

        return head.next;
    }
}
