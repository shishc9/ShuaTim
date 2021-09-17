import com.sun.deploy.net.MessageHeader;

import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 6:22
 * @Auther:ShiShc
 */

public class CQueue {

    LinkedList<Integer> A,B;

    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.add(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty()) {
            B.add(A.removeLast());
        }

        return B.removeLast();
    }

    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(3);
        obj.appendTail(4);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}


