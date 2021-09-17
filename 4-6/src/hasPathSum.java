/**
 * @date:2021-4-12, 20:50
 * @author:ShiShc
 */

public class hasPathSum {
    boolean flag = false;
    public boolean f(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return true;
    }

    private void dfs(TreeNode root, int targetSum) {
        if(root == null) {
            return ;
        }
        targetSum -= root.val;
        if(root.right == null && root.left == null && targetSum == 0) {
            if(!flag) {
                flag = true;
                return ;
            }
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
    }

}
