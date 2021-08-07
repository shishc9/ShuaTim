import java.util.Arrays;

public class LC455 {
    public int findContentChildren(int[] g, int [] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        int sIndex = s.length - 1, gIndex = g.length - 1;
        for(;gIndex >= 0 && sIndex >= 0;gIndex --) {
            if(s[sIndex] < g[gIndex]) {
                continue;
            }

            sIndex --;
            result ++;
        }

        return result;
    }
}
