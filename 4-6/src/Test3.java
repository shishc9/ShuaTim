import java.util.*;

/**
 * @date: 2021-4-24, 16:21
 * @author: ShiShc
 */

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //ArrayList<Integer> list = new ArrayList<>();
        List<Deque<Integer>> lists = new LinkedList<>();
        lists.add(new LinkedList<>());
        lists.add(new LinkedList<>());
        lists.add(new LinkedList<>());
        lists.add(new LinkedList<>());
        lists.add(new LinkedList<>());
        boolean[] dp = new boolean[6];
        for(int i = 0;i < n;i ++) {
            int temp = scanner.nextInt();
            lists.get(temp-1).add(i+1);
            dp[temp] = true;
            boolean flag = true;
            for(int j = 1; j <= 5;j ++) {
                if(!dp[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                int[] ints = new int[n];
                for(int j = 0;j < 5;j ++) {
                    ints[j] = lists.get(j).removeLast();
                    if(lists.get(j).size() == 0) {
                        dp[j+1] = false;
                    }
                }
                for(int j = 0;j < 5;j ++) {
                    System.out.print(ints[j]);
                    System.out.print(' ');
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }

    }
}
