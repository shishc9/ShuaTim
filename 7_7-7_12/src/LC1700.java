public class LC1700 {
    public int countStudents(int[] students, int[] sandwiches) {

        int[] count = new int[2];
        for(int student : students) {
            count[student] ++;
        }

        int n = sandwiches.length;
        for(int i = 0;i < n;i ++) {
            if(count[sandwiches[i]] > 0) {
                count[sandwiches[i]] --;
            } else {
                return n - i;
            }
        }

        return 0;
    }
}
