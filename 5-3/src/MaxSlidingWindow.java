import java.util.*;

public class MaxSlidingWindow {
    public int[] f(int[] nums, int k) {
        int left = 1 - k, right = 0;

        Deque<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(right < nums.length) {
            if(!queue.isEmpty() && queue.peek() < nums[right]) {
                queue.clear();
            }
            while(!queue.isEmpty() && queue.peekLast() < nums[right]) {
                queue.pollLast();
            }
            queue.add(nums[right++]);
            if(left >= 0) {
                int temp;
                list.add(temp = queue.peek());
                if(temp == nums[left]) {
                    queue.poll();
                }
            }
            left ++;

        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxSlidingWindow().f(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(new MaxSlidingWindow().f(new int[]{1,-1}, 1)));
    }
}
