import java.util.LinkedList;

public class LC707 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {this.val = val;}

        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    class MyLinkedList {

        ListNode head;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            head = new ListNode();
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            ListNode temp = head.next;
            while(temp != null && index > 0) {
                temp = temp.next;
                index --;
            }
            return temp == null ? -1 : temp.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            ListNode temp = head.next;
            head.next = new ListNode(val, temp);
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            ListNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val);
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if(index <= 0) {
                addAtHead(val);
            } else {
                ListNode cur = head.next;
                ListNode pre = head;
                while(cur.next != null && index > 0) {
                    cur = cur.next;
                    pre = pre.next;
                    index --;
                }
                if(index > 0) {
                    addAtTail(val);
                } else {
                    pre.next = new ListNode(val, cur);
                }
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            ListNode cur = head.next;
            ListNode pre = head;
            while (cur.next != null && index > 0) {
                cur = cur.next;
                pre = pre.next;
                index --;
            }

            if(index == 0) {
                pre.next = cur.next;
            }
        }
    }

}
