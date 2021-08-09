import java.util.ArrayList;
import java.util.List;

public class LC763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] hash = new int[26];

        for(int i = 0;i < s.length();i ++) {
            hash[s.charAt(i) - 'a'] = i;
        }

        int left = 0, right = 0;

        for(int i = 0;i < s.length();i ++) {
            right = Math.max(right, hash[s.charAt(i) - 'a']);
            if(i == right) {
                left = i + 1;
                result.add(right - left + 1);
            }
        }

        return result;
    }
}
