/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/28, 9:43
 * @Auther:ShiShc
 */

public class maxProfit {
//    public int maxProfit(int k, int[] price) {
//        k = Math.min(k, price.length/2);
//        int min = Integer.MAX_VALUE;
//        int sum = 0;
//        for(int i = 0;i < price.length; ++i) {
//            if(price[i] < min) {
//                min = price[i];
//            }
//        }
//    }
    //[7,1,5,3,6,4]
    public static int maxProfit(int[] price) {
        if(price.length == 1) return price[0];

        int sum = 0;
        for(int i = 1; i < price.length; i++) {
            sum += Math.max(price[i] - price[i-1], 0);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
