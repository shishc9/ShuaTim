/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/22, 19:48
 * @Auther:ShiShc
 */

public class search {
    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};
        System.out.println(search(array, 9));
    }

    public static int search(int[] array, int target) {
        int result = 0;
        for(int i:array) {
            if(i == target) {
                result ++;
            }
        }
        return result;
    }

}
