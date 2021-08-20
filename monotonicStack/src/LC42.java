public class LC42 {
    public int trapII(int[] height) {
        if(height.length <= 2) {
            return 0;
        }

        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int length = height.length;

        maxLeft[0] = height[0];
        for(int i = 1;i < length;i ++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }

        maxRight[length - 1] = height[length - 1];
        for(int i = length - 2;i >= 0;i --) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }

        int sum = 0;
        for(int i = 0;i < height.length;i ++) {
            int h = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if(h > 0) sum += h;
        }
        return sum;
    }

    public int trapI(int[] height) {
        int sum = 0;

        for(int i = 0;i < height.length;i ++) {
            if(i == 0 || i == height.length - 1) continue;

            int lHeight = height[i];
            int rHeight = height[i];
            for(int l = i - 1;l >= 0;l --) {
                if(height[l] > lHeight) {
                    lHeight = height[l];
                }
            }
            for(int r = i + 1;r < height.length;r ++) {
                if(height[r] > rHeight) {
                    rHeight = height[r];
                }
            }

            int h = Math.min(lHeight, rHeight) - height[i];
            if(h > 0) {
                sum += h;
            }
        }

        return sum;
    }
}
