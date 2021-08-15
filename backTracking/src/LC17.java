import java.util.LinkedList;
import java.util.List;

public class LC17 {

    private List<String> result = new LinkedList<>();
    private StringBuilder stringBuilder = new StringBuilder();

    private final String[] dic = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        char[] str = digits.toCharArray();
        help(str, 0);
        return result;
    }

    private void help(char[] digits, int curIndex) {
        if(curIndex == digits.length) {
            result.add(new String(stringBuilder));
            return ;
        }

        int index = digits[curIndex] - '0';
        String str = dic[index];
        for(int i = 0;i < str.length();i ++) {
            stringBuilder.append(str.charAt(i));
            help(digits, curIndex + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC17().letterCombinations("23"));
    }
}
