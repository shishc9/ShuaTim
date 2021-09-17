import java.util.HashSet;
import java.util.Set;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 14:41
 * @Auther:ShiShc
 */

public class intersection {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num:nums1) {
            set1.add(num);
        }

        for(int num:nums2) {
            set2.add(num);
        }

        return getIntersection(set1, set2);

    }

    public static int[] getIntersection(Set<Integer> set1, Set<Integer> set2) {
        if(set1.size() > set2.size()) {
            getIntersection(set2, set1);
        }

        HashSet<Integer> result = new HashSet<>();

        for(int num:set1) {
            if(set2.contains(num)) {
                result.add(num);
            }
        }

        int[] resultArray = new int[result.size()];
        int index = 0;

        for(int num:result) {
            resultArray[index++] = num;
        }

        return resultArray;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] nums3 = {4,9,5}, nums4 = {9,4,9,8,4};

        int[] result1 = intersection(nums1, nums2);
        int[] result2 = intersection(nums3, nums4);

        for(int i = 0;i < result1.length; ++i) {
            System.out.println(result1[i]);
        }

        System.out.println("-------------------");

        for(int i = 0;i < result2.length; ++i) {
            System.out.println(result2[i]);
        }

    }
}
