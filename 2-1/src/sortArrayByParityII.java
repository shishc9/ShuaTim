/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 14:50
 * @Auther:ShiShc
 */

public class sortArrayByParityII {

    public static int[] sortArrayByParityII(int[] A) {
        int length = A.length;
        int[] result = new int[length];

        int i = 0;
        for(int x : A) {
            if(x % 2 == 0) {
                result[i] = x;
                i += 2;
            }
        }

        i = 1;
        for(int x : A) {
            if(x % 2 != 0) {
                result[i] = x;
                i += 2;
            }
        }

        return result;
    }




    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] result = sortArrayByParityII(nums);

        for(int x:result) {
            System.out.println(x);
        }
    }
}
