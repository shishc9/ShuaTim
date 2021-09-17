/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/2/17, 15:32
 * @Auther:ShiShc
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {val = x;}
}


public class sortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {


        return buildBST(nums, 0, nums.length-1);
    }

    public TreeNode buildBST(int[] nums, int low, int high) {

        if(low > high) {
            return null;
        }

        int mid = (high - low + 1) / 2 + low;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, low, mid-1);
        root.right = buildBST(nums, mid+1, high);

        return root;
    }



    public static void main(String[] args) {

    }
}
