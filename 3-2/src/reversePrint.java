import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 23:00
 * @Auther:ShiShc
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }
}

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        if(head == null) return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
