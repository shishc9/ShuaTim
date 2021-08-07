public class LC134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i < gas.length;i ++) {
            int rest = gas[i] - cost[i];
            sum += rest;
            if(sum < min) {
                min = sum;
            }
        }

        if(sum < 0) {
            return -1;
        }

        if(min >= 0) {
            return 0;
        }

        for(int i = gas.length - 1;i >= 0;i --) {
            int rest = gas[i] - cost[i];
            min += rest;
            if(min >= 0) {
                return i;
            }
        }

        return -1;
    }
}
