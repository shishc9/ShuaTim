import java.util.ArrayList;
import java.util.Collections;

/**
 * @date: 2021-4-18, 21:47
 * @author: ShiShc
 */

public class Graph {
    public String f(int[][] costs) {
        int length = costs.length;
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(0);
        int[] cost = new int[length + 1];
        for(int node = 1; node < length; node ++) {
            int minCost = Integer.MAX_VALUE, minPos = Integer.MAX_VALUE;
            for(int pre = 0; pre < length; pre ++) {
                if(costs[pre][node] != -1 && costs[pre][node] + cost[pre] < minCost) {
                    minCost = costs[pre][node] + cost[pre];
                    minPos = pre;
                }
            }
            cost[node] = minCost;
            resultList.add(minPos);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(length - 1);
        for(int i = resultList.size()-1; i > 0;) {
            list.add(i = resultList.get(i));
        }
        Collections.reverse(list);
        StringBuilder result = new StringBuilder().append("the path is : ").append(list).append(", the cost is ").append(cost[length - 1]);
        return result.toString();
    }

    public static void main(String[] args) {
        int[][] costs = {
                {-1,  5,  3,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,   1,   3,   6,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,   8,   7,   6,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,   6,   8,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,   3,   5,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,   3,   3,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,   8,   4,  -1,  -1,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   2,   2,  -1,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   1,   2,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   3,   3,  -1,  -1,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   3,   5,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   5,   2,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   6,   6,  -1},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   4},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,   3},
                {-1, -1, -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1,  -1},
        };

        System.out.println(new Graph().f(costs));
    }
}
