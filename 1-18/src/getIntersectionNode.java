import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 22:02
 * @Auther:ShiShc
 */

public class getIntersectionNode {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;

        while(pA != pB) {
            pA = pA==null? headB:pA.next;
            pB = pB==null? headA:pB.next;
        }

        return pA;
    }

}
