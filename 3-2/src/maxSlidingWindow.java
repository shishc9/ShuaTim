/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 15:06
 * @Auther:ShiShc
 */


import java.util.LinkedList;

/**
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 */

public class maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        int length = nums.length;
        int left = 1-k;
        LinkedList<Integer> deque = new LinkedList<>();
        int[] result = new int[length - k + 1];
        for(int i = 0; i < length; ++i, left ++) {
            if(left > 0 && deque.peekFirst() == nums[left - 1])
                deque.removeFirst();
            while(!deque.isEmpty() && deque.peekLast() < nums[i])
                deque.removeLast();
            deque.add(nums[i]);
            if(left >= 0)
                result[left] = deque.peekFirst();
        }

        return result;
    }
}
