/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 16:00
 * @Auther:ShiShc
 */

public class getKthFromEnd {
    public static void main(String[] args) {

    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0;i < k; ++i) {
            former = former.next;
        }
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

}
