import java.util.ArrayList;
import java.util.Arrays;

/**
 * @date: 2021-5-12, 10:19
 * @author: ShiShc
 */

public class XORQueries {
    public int[] f(int[] arr, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] query : queries) {
            int result = 0;
            for (int left = query[0], right = query[1]; left <= right; left++) {
                result ^= arr[left];
            }
            list.add(result);
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    public int[] f2(int[] arr, int[][] queries) {
        int result = 0;
        for(int i = 0;i < arr.length;i ++) {
            result ^= arr[i];
            arr[i] = result;
        }

        int[] resultArr = new int[queries.length];
        int pos = 0;
        for(int[] query : queries) {
            if(query[0] == 0) {
                resultArr[pos++] = arr[query[1]];
            } else {
                resultArr[pos++] = arr[query[0] - 1] ^ arr[query[1]];
            }
        }

        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new XORQueries().f2(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}})));
    }
}
