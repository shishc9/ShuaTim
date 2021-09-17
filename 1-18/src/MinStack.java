import java.util.LinkedList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 6:40
 * @Auther:ShiShc
 */

public class MinStack {

    LinkedList<Integer> A,B;

    public MinStack() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void push(int x) {
        A.add(x);
        if(B.isEmpty() || B.getLast() >= x) {
            B.add(x);
        }
    }

    public void pop() {
        if(A.removeLast().equals(B.getLast()))
            B.removeLast();
    }

    public int top() {
        return A.getLast();
    }

    public int min() {
        return B.getLast();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        System.out.println(minStack.top());
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min()); //.
        System.out.println(minStack.top());
    }
}
