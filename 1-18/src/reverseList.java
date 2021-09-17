/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 16:08
 * @Auther:ShiShc
 */

public class reverseList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
         ListNode pre = null;
         ListNode pos = head;
         while(pos != null) {
             ListNode temp = pos.next;
             pos.next = pre;
             pre = pos;
             pos = temp;
         }

         return pre;
    }

}
