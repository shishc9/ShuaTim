import java.util.Arrays;

/**
 * @date: 2021-5-11, 15:59
 * @author: ShiShc
 * \给你一个整数数组perm，它是前n个正整数的排列，且n是个 奇数。
 *
 * 它被加密成另一个长度为 n - 1的整数数组encoded，满足encoded[i] = perm[i] XOR perm[i + 1]。比方说，如果perm = [1,3,2]，那么encoded = [2,1]。
 *
 * 给你encoded数组，请你返回原始数组perm。题目保证答案存在且唯一。
 */

public class Decode {
    public int[] f(int[] encoded) {
        int length = encoded.length + 1;
        int total = 0;
        for(int i = 1;i <= length;i ++) {
            total ^= i;
        }
        int odd = 0;
        for(int i = 1;i < length - 1;i += 2) {
            odd ^= encoded[i];
        }

        int first = total ^ odd;
        int[] result = new int[length];
        result[0] = first;
        for(int i = 0;i < result.length - 1;i ++) {
            result[i + 1] = result[i] ^ encoded[i];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Decode().f(new int[]{6, 5, 4, 6})));
    }
}
