class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

public class LC206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pre = null, cur = head, next;

        while(cur != null) {
            next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;
        }

        return pre;
    }
}
