

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public ListNode[] solve (int m, ListNode a) {
        ListNode[] result = new ListNode[m];
        ListNode[] help = new ListNode[m];
        while(a != null) {
            int index = a.val % m;
            if(result[index] == null) {
                result[index] = new ListNode(a.val);
                help[index] = result[index];
            } else {
                help[index].next = new ListNode(a.val);
                help[index] = help[index].next;
//                ListNode head = result[index];
//                while(head.next != null) {
//                    head = head.next;
//                }
//                head.next = new ListNode(a.val);
            }

            a = a.next;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(5 & 1);
        System.out.println();
    }
}