/**
 * @author: ShiShc
 * @date: 2021/7/20
 * @Desc:
 */
public class LC383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] times = new int[26];
        for(char c : magazine.toCharArray()) {
            times[c - 'a'] ++;
        }

        for(char c : ransomNote.toCharArray()) {
            if(times[c - 'a'] <= 0) {
                return false;
            }
            times[c - 'a'] --;
        }

        return true;
    }
}
