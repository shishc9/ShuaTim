import java.util.*;

/**
 * @date: 2021-4-24, 15:41
 * @author: ShiShc
 */

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < T;i ++) {
            list.add(scanner.nextInt());
        }
        for(int len : list) {
            int day = 1;
            LinkedList<Integer> deque = new LinkedList<>();
            deque.add(len);
            while(!deque.isEmpty()) {
                boolean flag = false;
                for(int i = deque.size(); i > 0;i --) {
                    int temp = deque.removeFirst();
                    if(temp != 1) {
                        int x = temp / 2;
                        int y = temp - x;
                        flag = true;
                        if(x != 1) deque.add(x);
                        if(y != 1) deque.add(y);
                    }
                }
                if(flag) day ++;
            }

            System.out.println(day);
        }
    }
}
