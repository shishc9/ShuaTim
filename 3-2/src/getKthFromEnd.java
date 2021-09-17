/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 23:14
 * @Auther:ShiShc
 */

public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null) return head;
        ListNode front = head, end = head;
        int temp = k;
        while(temp > 0) {
            front = front.next;
            temp --;
        }
        while(front != null) {
            front = front.next;
            end = end.next;
        }

        return end;
    }
}
