public class LC654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) {
            return null;
        }

        return help(nums, 0, nums.length);
    }

    private TreeNode help(int[] nums, int left, int right) {
        if(left == right) return null;

        int maxValue = Integer.MIN_VALUE;
        int index = 0;
        for(int i = left;i < right;i ++) {
            if(nums[i] > maxValue) {
                maxValue = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(maxValue);

        if(right - left == 1) return root;

        root.left = help(nums, left, index);
        root.right = help(nums, index + 1, right);
        return root;
    }
}
