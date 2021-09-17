import java.util.ArrayList;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/21, 10:26
 * @Auther:ShiShc
 */

public class findTarget {

    public static boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);

        int left = 0, right = list.size() - 1;
        while(left < right) {
            int sum = list.get(left) + list.get(right);
            if(sum == k) return true;
            if(sum < k) left ++;
            else right ++;
        }

        return false;
    }

    private static void helper(TreeNode root, ArrayList<Integer> arrayList) {
        if(root == null) return;
        helper(root.left, arrayList);
        arrayList.add(root.val);
        helper(root.right, arrayList);
    }



    public static void main(String[] args) {

    }
}
