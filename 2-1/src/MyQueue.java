import java.util.LinkedList;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 16:15
 * @Auther:ShiShc
 */

public class MyQueue {

    Stack<Integer> A, B;

    public MyQueue() {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
    }

    public void push(int x) {
        A.push(x);
    }

    public int pop() {
        if(!B.isEmpty()) return B.pop();
        if(A.isEmpty()) return -1;

        while(!A.isEmpty()) {
            B.push(A.pop());
        }

        return B.pop();
    }

    public int peek() {
        if(!B.isEmpty()) return B.peek();
        if(A.isEmpty()) return -1;

        while(!A.isEmpty()) {
            B.push(A.pop());
        }

        return B.peek();
    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
