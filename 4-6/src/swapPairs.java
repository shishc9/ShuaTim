/**
 * @date: 2021-4-23, 19:00
 * @author: ShiShc
 */

public class swapPairs {
    public ListNode f(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while(temp.next != null && temp.next.next != null) {
            ListNode n1 = temp.next;
            ListNode n2 = temp.next.next;
            temp.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            temp = n1;
        }

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println(new swapPairs().f(head));
    }
}
