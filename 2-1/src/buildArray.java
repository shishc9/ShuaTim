import java.util.LinkedList;
import java.util.List;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/2, 16:33
 * @Auther:ShiShc
 */

public class buildArray {

    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new LinkedList<>();

        int pos = 0;
        for(int i = 1;i <= n && pos < target.length; ++ i) {
            if(target[pos] == i) {
                result.add("Push");
                pos ++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] target = {2,3,4};
        List<String> result = buildArray(target, 4);

        for(String str:result) {
            System.out.println(str.toString());
        }
    }
}
