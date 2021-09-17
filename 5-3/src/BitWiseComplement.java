/**
 * @date: 2021-5-18, 09:45
 * @author: ShiShc
 */

public class BitWiseComplement {
    public int f(int N) {
        if(N==0) return 1;
        int temp = N;
        N = (N>>>1) | N;
        N = (N>>>2)| N;
        N = (N>>>4)| N;
        N = (N>>>8)| N;
        N = (N>>>16)| N;
        return N & (-temp-1);
    }
}
