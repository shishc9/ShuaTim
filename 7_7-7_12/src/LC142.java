public class LC142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                ListNode temp1 = head;
                ListNode temp2 = fast;
                while(temp1 != temp2) {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }

                return temp1;
            }

        }

        return null;
    }
}
