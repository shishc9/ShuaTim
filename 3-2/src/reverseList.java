/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 23:18
 * @Auther:ShiShc
 */

public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, temp = head;
        while(temp != null) {
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return pre;
    }
}
