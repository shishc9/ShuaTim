import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/31, 13:53
 * @Auther:ShiShc
 */

public class MedianFinder {

    Queue<Integer> A,B;

    public MedianFinder() {
        /**
         * 最小堆
         */
        A = new PriorityQueue<>();

        /**
         * 最大堆 ： 用lambda表达式初始化
         */
        B = new PriorityQueue<>((x,y) -> (y - x));
    }

    public void addNum(int num) {
        if(A.size() != B.size()) {
             A.add(num);
             B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek():(A.peek() + B.peek())/2.0;
    }


    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(2);
        System.out.println(obj.findMedian());
        obj.addNum(3);
        System.out.println(obj.findMedian());
    }
}
