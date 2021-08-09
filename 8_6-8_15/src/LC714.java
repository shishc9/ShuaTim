public class LC714 {
    public int maxProfit(int[] prices, int fee) {
        int result = 0;

        int minPrice = prices[0];
        for(int i = 1;i < prices.length;i ++) {
            if(prices[i] < minPrice) minPrice = prices[i];
            if(prices[i] > minPrice + fee) {
                result += prices[i] - minPrice - fee;
                minPrice = prices[i] - fee;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC714().maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
    }
}
