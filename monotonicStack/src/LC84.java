public class LC84 {
    public int largestRectangleArea(int[] heights) {
        int[] minLeft = new int[heights.length];
        int[] minRight = new int[heights.length];
        int length = heights.length;

        minLeft[0] = -1;
        for(int i = 1;i < length;i ++) {
            int index = i - 1;
            while(index >= 0 && heights[index] >= heights[i]) {
                index = minLeft[index];
            }

            minLeft[i] = index;
        }

        minRight[length - 1] = length;
        for(int i = length - 2;i >= 0;i --) {
            int index = i + 1;
            while(index < length && heights[index] >= heights[i]) {
                index = minRight[index];
            }
            minRight[i] = index;
        }

        int result = 0;
        for(int i = 0;i < length;i ++) {
            int sum = heights[i] * (minRight[i] - minLeft[i] - 1);
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC84().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}
