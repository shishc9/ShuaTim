import java.util.*;

/**
 * @author: ShiShc
 * @date: 2021/7/25
 * @Desc:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] result = new int[T];
        for(int i = 0;i < T;i ++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int Q = scanner.nextInt();
            Deque<Integer> queue = new LinkedList<>();
            queue.addLast(A);
            boolean flag = false;
            int min = 0;

            while(!queue.isEmpty()) {
                for(int j = queue.size();j > 0;j --) {
                    Integer num = queue.pollFirst();
                    int AB = num + B;
                    int AC = num * C;
                    min = Math.min(AB, AC);
                    if(min > Q) {
                        break;
                    }
                    if(Q == AB || Q == AC) {
                        flag = true;
                        break;
                    }
                    queue.addLast(AB);
                    queue.addLast(AC);
                }
            }

            if(flag) {
                result[i] = 1;
            }
        }

        for(int i = 0;i < T;i ++) {
            System.out.println(result[i]);
        }
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[][] nums = new int[N][2];
//        boolean flag = false;
//        for(int i = 0;i < N;i ++) {
//            nums[i][0] = scanner.nextInt();
//            nums[i][1] = scanner.nextInt();
//        }
//
//        for(int i = 0;i < N;i ++) {
//            for(int j = 0;j < N;j ++) {
//                if(i != j) {
//                    flag = nums[j][0] >= nums[i][0] && nums[j][1] <= nums[i][1];
//                    if(flag) {
//                        System.out.println("true");
//                        break;
//                    }
//                }
//            }
//        }
//
//        if(!flag) {
//            System.out.println("false");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        ArrayList<Integer> list = new ArrayList<>(N * 2);
//        int[] num1 = new int[N];
//        int[] num2 = new int[N];
//
//        for(int i = 0;i < N;i ++) {
//            num1[i] = scanner.nextInt();
//        }
//        for(int i = 0;i < N;i ++) {
//            num2[i] = scanner.nextInt();
//        }
//
//        for(int i = 0;i < N;i ++) {
//            list.add(num1[i]);
//            list.add(num2[i]);
//        }
//
//        System.out.println(list);
//
//        int duoduoji = 0, duoduoya = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0;i < 2 * N;i ++) {
//            int currentNum = list.get(i);
//            if(!map.containsKey(currentNum)) {
//                map.put(currentNum, map.size());
//                continue;
//            }
//
//            Integer index = map.get(currentNum);
//
//            if(i % 2 == 0) {
//                duoduoji += i - index + 1;
//            } else {
//                duoduoya += i - index + 1;
//            }
//
//            for(int j = index;j < i;j ++) {
//                map.remove(list.get(j));
//            }
//        }
//
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getKey() % 2 == 0) {
//                duoduoya++;
//            } else {
//                duoduoji++;
//            }
//        }
//
//        System.out.print(duoduoji);
//        System.out.print(" ");
//        System.out.print(duoduoya);
//    }
}
