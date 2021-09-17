/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 23:09
 * @Auther:ShiShc
 */

public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) return head;
        if(head.val == val) return head.next;
        ListNode pre = head, temp = head.next;
        while(temp != null) {
            if(temp.val == val) {
                pre.next = temp.next;
                break;
            }
            pre = pre.next;
            temp = temp.next;
        }

        return head;
    }
}
