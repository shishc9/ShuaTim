import java.util.*;

public class LC451 {
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> dic = new HashMap<>();

        for(char c : s.toCharArray()) {
            int temp = 1;
            if(dic.containsKey(c)) {
                temp = dic.get(c);
                temp ++;
            }
            dic.put(c, temp);
        }

        List<Map.Entry<Character, Integer>> dicList = new ArrayList<>(dic.entrySet());

        dicList.sort((o1, o2) -> (o2.getValue() - o1.getValue()));

        for(int i = 0;i < dicList.size();i ++) {
            if(dicList.get(i).getValue() > 0) {
                for(int times = dicList.get(i).getValue(); times > 0; times --) {
                    result.append(dicList.get(i).getKey());
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LC451().frequencySort("2a554442f544asfasssffffasss"));
    }
}
