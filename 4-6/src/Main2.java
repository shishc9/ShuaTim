import java.util.ArrayList;
import java.util.Scanner;

/**
 * @date: 2021-4-27, 19:53
 * @author: ShiShc
 */

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < N;i ++) {
            list.add(scanner.nextInt());
        }
        ArrayList<Integer> dp = new ArrayList<>();
        boolean flag = false;
        int temp = 0;
        for(Integer integer : list) {
            if(integer == 1) {
                if(flag) {
                    dp.add(temp);
                    temp = 0;
                    flag = false;
                } else {
                    dp.add(1);
                }
            } else {
                flag = true;
                temp ++;
            }
        }


    }
}
