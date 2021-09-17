/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/23, 15:21
 * @Auther:ShiShc
 */

public class deleteNode {
    public static void main(String[] args) {

    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        else if(head.next == null) {
            if(head.val == val) {
                head = null;
            }
            return head;
        } else {
            ListNode preNode = head;
            ListNode temp = head.next;
            if(preNode.val == val) {
                head = head.next;
                preNode.next = null;
            } else {
                while(temp != null) {
                    if(temp.val == val) {
                        preNode.next = temp.next;
                        temp.next = null;
                    }
                    temp = temp.next;
                    preNode = preNode.next;
                }
            }
        }

        return head;
    }

}
