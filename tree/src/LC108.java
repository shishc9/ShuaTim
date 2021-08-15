public class LC108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums, 0, nums.length);
    }

    private TreeNode help(int[] nums, int left, int right) {
        if(left == right) return null;

        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        if(right - left == 1) return root;

        root.left = help(nums, left, mid);
        root.right = help(nums, mid + 1, right);
        return root;
    }
}
