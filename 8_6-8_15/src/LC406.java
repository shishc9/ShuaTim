import java.util.ArrayList;
import java.util.Arrays;

public class LC406 {
    public int[][] reconstructQueue(int[][] people) {
        ArrayList<int[]> result = new ArrayList<>();

        Arrays.sort(people, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }

            return o2[0] - o1[0];
        });

        for(int[] person : people) {
            result.add(person[1], person);
        }

        return result.toArray(new int[0][0]);
    }
}
