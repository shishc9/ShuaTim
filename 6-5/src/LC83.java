/**
 * @author: ShiShc
 * @desc:
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}



public class LC83 {
    public ListNode f(ListNode head) {
        ListNode pre = head, cur = head.next;

        while(cur != null) {
            if(pre.val == cur.val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;
    }
}
