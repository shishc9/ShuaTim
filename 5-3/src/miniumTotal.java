import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @date: 2021-5-3, 16:45
 * @author: ShiShc
 */

public class miniumTotal {
    public int f(List<List<Integer>> triangle) {
        if(triangle.size() == 1) {
            return triangle.get(0).get(0);
        }

        for(int i = 1;i < triangle.size();i ++) {
            for(int j = 0;j < triangle.get(i).size();j ++) {
                if(j == 0) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i-1).get(j));
                } else if(j == triangle.get(i - 1).size()) {
                    triangle.get(i).set(j, triangle.get(i).get(j) + triangle.get(i-1).get(j-1));
                } else {
                    triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1)));
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i = 0;i < triangle.get(triangle.size() - 1).size(); i++) {
            result = Math.min(result, triangle.get(triangle.size() - 1).get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(6,5,7));
        list.add(Arrays.asList(4,1,8,3));
        System.out.println(new miniumTotal().f(list));
    }
}
