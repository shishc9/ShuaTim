import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 7:12
 * @Auther:ShiShc
 */

public class MaxQueue {

    /**
     * boolean add(E e); 添加队列
     * E element(); 检索，但不删除，这个队列的头
     * boolean offer(E e); 插入
     * E peek() 检索但不删除 返回null
     * E poll() 检索并删除 返回null
     * E remove() 检索并删除
     */

    Queue<Integer> q;
    Deque<Integer> d;

    public MaxQueue() {
        q = new LinkedList<Integer>();
        d = new LinkedList<Integer>();
    }

    public int max_value() {
        return d.isEmpty() ? -1:d.peekFirst();
    }

    public void push_back(int value) {
        q.offer(value);
        while(!d.isEmpty() && d.peekLast() < value)
            d.pollLast();
        d.offerLast(value);
    }

    public int pop_front() {
        if(q.isEmpty()) return -1;

        if(q.peek().equals(d.peekFirst()))
            d.pollFirst();

        return q.poll();
    }



//    LinkedList<Integer> A, B;
//
//    public MaxQueue() {
//        A = new LinkedList<Integer>();
//        B = new LinkedList<Integer>();
//    }
//
//    public int max_value() {
//        if(B.isEmpty()) {
//            return -1;
//        }
//        return B.getLast();
//    }
//
//    public void push_back(int value) {
//        A.add(value);
//        if(B.isEmpty() || B.getLast() < value) {
//            B.add(value);
//        }
//    }
//
//    public int pop_front() {
//        if(A.isEmpty()) {
//            return -1;
//        }
//        int temp = A.getFirst();
//
//        if(A.removeFirst().equals(B.getFirst())) {
//            B.removeFirst();
//        }
//
//        return temp;
//    }

    public static void main(String[] args) {
        MaxQueue obj = new MaxQueue();
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
        obj.push_back(46);
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        obj.push_back(868);
        System.out.println(obj.pop_front());
        System.out.println(obj.pop_front());
        System.out.println(obj.pop_front());
        obj.push_back(525);
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
        System.out.println(obj.pop_front());
        System.out.println(obj.max_value());
        obj.push_back(123);
        obj.push_back(646);
        System.out.println(obj.max_value());
        obj.push_back(229);
        System.out.println(obj.max_value());




    }



}
