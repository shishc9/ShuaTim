/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/23, 14:37
 * @Auther:ShiShc
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}


public class hasCycle {

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }

        ListNode rabbit = head.next, turtle = head;
        while(rabbit != turtle) {
            if(rabbit == null || rabbit.next == null) {
                return false;
            }
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }

        return true;
    }


    public static void main(String[] args) {

    }
}
