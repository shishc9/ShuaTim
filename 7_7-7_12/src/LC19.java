public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode node = new ListNode(0, head);

        ListNode pre = node, cur = node;

        while(n-- > 0) {
            cur = cur.next;
        }

        cur = cur.next;

        while(cur != null) {
            cur = cur.next;
            pre = pre.next;
        }

        pre.next = pre.next.next;
        return node.next;
    }
}
