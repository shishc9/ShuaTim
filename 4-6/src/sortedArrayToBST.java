/**
 * @date:2021-4-12, 11:52
 * @author:ShiShc
 */

public class sortedArrayToBST {
    public TreeNode f(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        return help(nums, 0, nums.length-1);
    }

    private TreeNode help(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = help(nums, left, mid-1);
        node.right = help(nums, mid+1, right);
        return node;
    }


}
