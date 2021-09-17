import java.util.Stack;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 15:32
 * @Auther:ShiShc
 */

public class CQueue {

    Stack<Integer> A, B;

    public CQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void appendTail(int value) {
        A.push(value);
    }

    public int deleteHead() {
        while(!A.isEmpty()) {
            B.push(A.pop());
        }
        int result = B.isEmpty() ? -1 : B.pop();
        while(!B.isEmpty()) {
            A.push(B.pop());
        }
        return result;
    }
}
