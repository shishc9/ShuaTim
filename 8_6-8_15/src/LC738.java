public class LC738 {
    public int monotoneIncreasingDigits(int n) {
        if(n < 10) {
            return n;
        }

        char[] item = String.valueOf(n).toCharArray();
        int flag = item.length;

        for(int i = item.length - 1;i >= 1;i --) {
            if(item[i - 1] > item[i]) {
                flag = i;
                item[i - 1] --;
            }
        }

        for(int i = flag;i < item.length;i ++) {
            item[i] = '9';
        }

        return Integer.parseInt(String.valueOf(item));
    }

    public static void main(String[] args) {
        System.out.println(new LC738().monotoneIncreasingDigits(1001));
    }
}
