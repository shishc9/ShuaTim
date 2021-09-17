import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @date: 2021-4-27, 19:05
 * @author: ShiShc
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i = 1; i <= T; i++) {
            int Ti = scanner.nextInt();
            boolean flag = false;
            boolean isFirst = true;

            List<Integer> list = new ArrayList<>();
            list.add(1);
            int result = 0;
            while(Ti != 0) {
                int base = 2, day = 1;
                double temp;
                for(; (temp = Math.pow(base, (double) day - 1)) <= Ti;) {
                    if(temp == Ti) {
                        flag = true;
                        break;
                    }
                    day ++;
                }
                if(flag) {
                    if(!isFirst) {
                        list.add(day);
                    } else {
                        isFirst = false;
                        result = day;
                    }
                    break;
                }
                day --;
                Ti -= temp / 2;
                list.add(day);
                isFirst = false;
                result = day;
            }

            Collections.sort(list);
            System.out.println(result);
            for (Integer integer : list) {
                System.out.print(integer.toString() + ' ');
            }
            System.out.println();
        }
    }
}
