import java.util.LinkedList;
import java.util.List;

public class LC131 {

    private List<List<String>> result = new LinkedList<>();
    private LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        help(s, 0);
        return result;
    }

    private void help(String s, int startIndex) {
        if(startIndex == s.length()) {
            result.add(new LinkedList<>(path));
            return ;
        }

        for(int i = startIndex;i < s.length();i ++) {
            if(isPalindrome(s, startIndex, i)) {
                path.add(s.substring(startIndex, i + 1));
            } else {
                continue;
            }
            help(s, i + 1);
            path.pollLast();
        }
    }

    private boolean isPalindrome(String s, int startIndex, int i) {
        for(;startIndex <= i; startIndex ++, i --) {
            if(s.charAt(startIndex) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
