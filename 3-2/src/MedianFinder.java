import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/25, 16:04
 * @Auther:ShiShc
 */

public class MedianFinder {

    ArrayList<Integer> arr;

    public  MedianFinder() {
        arr = new ArrayList<>();
    }

    public void addNum(int num) {
        arr.add(num);
    }

    public double findMedian() {
        Collections.sort(arr);
        int size = arr.size();
        return size % 2 == 0 ? (arr.get(size/2) + arr.get(size/2-1)) / 2.0 : arr.get(size/2);
    }

    public static void main(String[] args) {
        MedianFinder finder = new MedianFinder();
        finder.addNum(6);
        System.out.println(finder.findMedian());
        finder.addNum(10);
        System.out.println(finder.findMedian());
        finder.addNum(2);
        System.out.println(finder.findMedian());
        finder.addNum(6);
        System.out.println(finder.findMedian());
        finder.addNum(5);
        System.out.println(finder.findMedian());
        finder.addNum(0);
        System.out.println(finder.findMedian());
    }
}
