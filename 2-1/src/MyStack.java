import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 15:59
 * @Auther:ShiShc
 */

public class MyStack {

    Deque<Integer> A;

    public MyStack() {
        A = new LinkedList<Integer>();
    }

    public void push(int x) {
        A.addLast(x);
    }

    public int pop() {
        return A.removeLast();
    }

    public int top() {
        return A.getLast();
    }

    public boolean empty() {
        return  A.size() == 0;
    }


    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
}
