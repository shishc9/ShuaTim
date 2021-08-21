import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

//    static int result = 0;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int X = scanner.nextInt();
//        int M = scanner.nextInt();
//        int[] prices = new int[M];
//        for(int i = 0;i < M;i ++) {
//            prices[i] = scanner.nextInt();
//        }
//
//        Arrays.sort(prices);
//        backTracking(prices, X, 0, 0);
//        if(result == 0) {
//            result = -1;
//        }
//        System.out.println(result);
//    }
//
//    private static void backTracking(int[] prices, int sum, int curSum, int startIndex) {
//        if(curSum == sum) {
//            result ++;
//            return ;
//        }
//
//        for(int i = startIndex;i < prices.length;i ++) {
//            if(prices[i] > sum) {
//                break;
//            }
//            backTracking(prices, sum, curSum + prices[i], i + 1);
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int[] prices = new int[N];
        int[] amounts = new int[N];
        int[] loves = new int[N];
        double[][] dic = new double[N][2];
        int result = 0;
        for(int i = 0;i < N;i ++) {
            prices[i] = scanner.nextInt();
            amounts[i] = scanner.nextInt();
            loves[i] = scanner.nextInt();
            dic[i][0] = i;
            dic[i][1] = (double) loves[i] / prices[i];
        }
        Arrays.sort(dic, Comparator.comparingDouble(o -> o[1]));

        for(int i = N - 1;i >= 0;i --) {
            int index = (int) dic[i][0];
            int amount = Math.min(amounts[index], X / prices[index]);
            X -= amount * prices[index];
            result += amount * loves[index];
        }

        System.out.println(result);
    }
}
