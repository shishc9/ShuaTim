/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 15:37
 * @Auther:ShiShc
 */

public class mergeTwoLists {

    public ListNode mergeTwoLists (ListNode L1, ListNode L2) {
        if(L1 == null) return L2;
        if(L2 == null) return L1;

        ListNode head = new ListNode(0);
        ListNode temp = head;

        while(L1 != null && L2 != null) {
            if(L1.val > L2.val) {
                temp.next = L2;
                L2 = L2.next;
            } else {
                temp.next = L1;
                L1 = L1.next;
            }
            temp = temp.next;
        }

        temp.next = L1 == null ? L2 : L1;
        return head.next;
    }


    public static void main(String[] args) {

    }
}
