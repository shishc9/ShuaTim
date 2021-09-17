import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date:2021-4-11, 22:53
 * @author:ShiShc
 */

public class letterCombinations {
    public List<String> f(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits.length() == 0) {
            return list;
        }

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(list, map, digits, 0, new StringBuffer());
        return list;
    }

    private void backtrack(List<String> list, Map<Character, String> map, String digits, int index, StringBuffer stringBuffer) {
        if(index == digits.length()) {
            list.add(stringBuffer.toString());
        } else {
            char c = digits.charAt(index);
            String letters = map.get(c);
            int lettersCount = letters.length();
            for(int i = 0; i < lettersCount; i++) {
                stringBuffer.append(letters.charAt(i));
                backtrack(list, map, digits, index+1, stringBuffer);
                stringBuffer.deleteCharAt(index);
            }
        }
    }



    public static void main(String[] args) {
        letterCombinations obj = new letterCombinations();
        List<String> list1 = obj.f("23");
        System.out.println(list1.toString());
    }
}
