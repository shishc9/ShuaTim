import java.util.LinkedList;
import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 16:03
 * @Auther:ShiShc
 */

/**
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 */

public class MinStack {

    Stack<Integer> stack;
    LinkedList<Integer> queue;

    public MinStack() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
        if(queue.isEmpty() || queue.peekLast() >= x) {
            queue.addLast(x);
        }
    }

    public void pop() {
        if(stack.peek().equals(queue.peekLast())) {
            queue.removeLast();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return queue.peekLast();
    }

}
