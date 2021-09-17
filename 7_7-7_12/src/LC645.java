import java.util.HashMap;
import java.util.Map;

public class LC645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)  {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int i = 1;i <= n;i ++) {
            int count = map.getOrDefault(i, 0);
            if(count == 2) {
                result[0] = i;
            } else if(count == 0) {
                result[1] = i;
            }
        }

        return result;
    }
}
