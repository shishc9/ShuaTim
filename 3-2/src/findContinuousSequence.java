/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/26, 16:28
 * @Auther:ShiShc
 */

import java.util.ArrayList;

/**
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 */

public class findContinuousSequence {
    public static int[][] findContinuousSequence(int target) {
        int left = 1, right = 2, s = 3;
        ArrayList<int[]> res = new ArrayList<>();

        while(left < right) {
            if(s == target) {
                int[] temp = new int[right - left + 1];
                for(int i = left;i <= right; ++i) {
                    temp[i - left] = i;
                }
                res.add(temp);
            }
            if(s >= target) {
                s -= left;
                left ++;
            } else {
                right ++;
                s += right;
            }
        }

        return res.toArray(new int[0][]);
    }


    public static void main(String[] args) {
        int[][] ints = findContinuousSequence(9);
        for(int i[] : ints) {
            for(int j : i) {
                System.out.println(j);
            }
        }
    }
}
