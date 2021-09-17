/**
 * @date: 2021-4-23, 20:21
 * @author: ShiShc
 */

public class maxArea {
    public int f(int[] height) {
        int left = 0, right = height.length - 1;
        int result = 0;
        while(left < right) {
            result = height[left] < height[right] ?
                    Math.max(result, (right - left) * height[left++]) :
                    Math.max(result, (right - left) * height[right--]);
        }
        return result;

//        int i = 0, j = height.length - 1, res = 0;
//        while(i < j){
//            res = height[i] < height[j] ?
//                    Math.max(res, (j - i) * height[i++]):
//                    Math.max(res, (j - i) * height[j--]);
//        }
//        return res;
    }


    public static void main(String[] args) {
        System.out.println(new maxArea().f(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
