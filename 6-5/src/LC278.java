/**
 * @author: ShiShc
 * @desc:
 */
public class LC278 {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = (left + right) >> 1;
            if(isBadVersion(mid)) {
                right = mid;
            } else if(!isBadVersion(mid)) {
                left= mid + 1;
            }
        }

        return left;
    }

    private boolean isBadVersion(int n) {
        return true;
    }

}
