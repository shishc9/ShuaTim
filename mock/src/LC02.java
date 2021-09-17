public class LC02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        int add = 0;

        while(l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int temp = val1 + val2;
            if(add != 0) {
                temp += add;
            }
            add = temp / 10;
            temp = temp % 10;

            cur.next = new ListNode(temp);
            cur = cur.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(add != 0) {
            cur.next = new ListNode(add);
        }

        return head.next;
    }
}
