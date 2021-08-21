

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        int oneNum = 0, zeroNum = 0;
//        int[][] arr = new int[n][2];
//        String str = scanner.nextLine();
//        for(int i = 0;i < str.length();i ++) {
//            char c = str.charAt(i);
//            if(i > 0) {
//                arr[i][0] = arr[i - 1][0];
//                arr[i][1] = arr[i - 1][1];
//            }
//            if(c == '0') {
//                zeroNum ++;
//                arr[i][0] ++;
//            } else {
//                oneNum ++;
//                arr[i][1] ++;
//            }
//        }
//
//        int[] result = new int[n];
//        Arrays.fill(result, 1);
//
//        for(int i = 1;i < n;i ++) {
//            for(int j = 0;j < i;j ++) {
//                int behindZero = arr[i][0] - arr[j][0];
//                int behindOne = arr[i][1] - arr[j][1];
//                if(arr[j][0] == 0 && behindOne == 0) {
//                    continue;
//                }
//                if(arr[j][1] == 0 && behindZero == 0) {
//                    continue;
//                }
//                if(arr[j][0] * behindOne == arr[j][1] * behindZero) {
//                    result[i] ++;
//                }
//            }
//        }
//
//        for(int i = 0;i < n;i ++) {
//            System.out.println(result[i]);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] x = new int[n];
//        int[] y = new int[n];
//        for(int i = 0;i < n;i ++) {
//            x[i] = scanner.nextInt();
//            y[i] = scanner.nextInt();
//        }
//
//        int[] dp = new int[n];
//        dp[0] = 0;
//        for(int i = 1;i < n;i ++) {
//            int leftIndex = i - 1;
//            for(; leftIndex >= 0; leftIndex --) {
//                if(x[i] == x[leftIndex]) {
//                    continue;
//                }
//                int i1 = (y[i] - y[leftIndex]) / (x[i] - x[leftIndex]);
//                if(i1 == -1) {
//                    break;
//                }
//            }
//            if(leftIndex == -1) {
//                continue;
//            }
//            dp[i] = dp[leftIndex] + 1;
//        }
//
//        int result = 0;
//
//        for(int i = 0;i < n;i ++) {
//            result += dp[i];
//        }
//
//        int[] dp2 = new int[n];
//        dp2[0] = 0;
//        for(int i = 1;i < n;i ++) {
//            int leftIndex = i - 1;
//            for(; leftIndex >= 0; leftIndex --) {
//                if(x[i] == x[leftIndex]) {
//                    continue;
//                }
//                int i1 = (y[i] - y[leftIndex]) / (x[i] - x[leftIndex]);
//                if(i1 == 1) {
//                    break;
//                }
//            }
//            if(leftIndex == -1) {
//                continue;
//            }
//            dp2[i] = dp2[leftIndex] + 1;
//        }
//
//        for(int i = 0;i < n;i ++) {
//            result += dp2[i];
//        }
//
//        System.out.println(result);
//    }
}
