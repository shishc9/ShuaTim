public class LC860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0, tenCount = 0;

        for(int i = 0;i < bills.length;i ++) {
            if(bills[i] == 5) {
                fiveCount ++;
            } else if(bills[i] == 10) {
                tenCount ++;
                if(fiveCount > 0) {
                    fiveCount --;
                } else {
                    return false;
                }
            } else if(bills[i] == 20) {
                if(tenCount > 0) {
                    tenCount --;
                    if(fiveCount > 0) {
                        fiveCount --;
                    } else {
                        return false;
                    }
                } else if(fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LC860().lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}
