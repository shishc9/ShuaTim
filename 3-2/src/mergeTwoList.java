/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 15:39
 * @Auther:ShiShc
 */

public class mergeTwoList {

    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        temp.next = (l1 != null ? l1 : l2);

        return result.next;
    }

    public static void main(String[] args) {

    }
}
