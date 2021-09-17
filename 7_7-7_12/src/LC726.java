import java.util.*;

public class LC726 {

    int i;
    int n;
    String formula;

    public String countOfAtoms(String formula) {
        this.n = formula.length();
        this.i = 0;
        this.formula = formula;

        StringBuilder result = new StringBuilder();

        Deque<Map<String, Integer>> stack = new LinkedList<>();
        stack.push(new HashMap<>());

        while(i < n) {
            char c = formula.charAt(i);
            if(c == '(') {
                i ++;
                stack.push(new HashMap<>());
            } else if(c == ')') {
                i ++;
                int num = parseNum();
                Map<String, Integer> popMap = stack.pop();
                Map<String, Integer> peekMap = stack.peek();
                for(Map.Entry<String, Integer> entry : popMap.entrySet()) {
                    String atom = entry.getKey();
                    int v = entry.getValue();
                    peekMap.put(atom, peekMap.getOrDefault(atom, 0) + v * num);
                }
            } else {
                String atom = parseAtom();
                int num = parseNum();
                Map<String, Integer> peekMap = stack.peek();
                peekMap.put(atom, peekMap.getOrDefault(atom, 0) + num);
            }
        }

        Map<String, Integer> map = stack.pop();
        TreeMap<String, Integer> treeMap = new TreeMap<>(map);

        for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String atom = entry.getKey();
            int count = entry.getValue();
            result.append(atom);
            if(count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }

    private String parseAtom() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(formula.charAt(i ++));
        while(i < n && Character.isLowerCase(formula.charAt(i))) {
            stringBuilder.append(formula.charAt(i ++));
        }

        return stringBuilder.toString();
    }

    private int parseNum() {
        if(i == n || !Character.isDigit(formula.charAt(i))) {
            return 1;
        }

        int num = 0;
        while(i < n && Character.isDigit(formula.charAt(i))) {
            num = num * 10 + formula.charAt(i++) - '0';
        }

        return num;
    }
}
