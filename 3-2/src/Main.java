/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/27, 16:03
 * @Auther:ShiShc
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输入描述
 * 第一行一个数 T，表示一共有 T 组测试数据。(1 ≤ T ≤ 100)。
 *
 * 接下来 T 组数据，每组数据两行，
 *
 * 第一行一个数 n，表示有 n 块积木。(1 ≤ n ≤ 20000)。
 *
 * 第二行 n 个数字，第 i 块积木上的数字是 si。(si是0-9的数字)。
 *
 * 输出描述
 * 每组数据输出一行，表示最终摆好的积木形成的数字串。
 *
 *
 * 样例输入
 * 2
 * 5
 * 00011
 * 5
 * 11210
 * 样例输出
 * 00001
 * 01210
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0;i < T; ++i) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int flag = 0;
            int posLeft = -1, posRight = -1;
            for(int left = 0, right = s.length() - 1; left < right; left ++, right --) {
                if(s.charAt(left) != s.charAt(right)) {
                    flag ++;
                    posLeft = left;
                    posRight = right;
                }
            }

            if(flag == 0) System.out.println(s);
            if(flag == 1) {
                StringBuilder builder = new StringBuilder(s);
                builder.setCharAt(posLeft, s.charAt(posRight));
                int x = Integer.valueOf(builder.toString());
                StringBuilder builder2 = new StringBuilder(s);
                builder2.setCharAt(posRight, s.charAt(posLeft));
                int y = Integer.valueOf(builder2.toString());
                int flag2 = 0;
                if(x > y) flag2 = 1;
                if(flag2 == 0) {
                    System.out.println(builder.toString());
                } else {
                    System.out.println(builder2.toString());
                }
            }
            if(flag > 1) {
                StringBuilder builder = new StringBuilder(s);
                int index = 0;
                while(builder.charAt(index) == '0') index ++;
                builder.setCharAt(index, '0');
                System.out.println(builder.toString());
            }
        }
    }
}
