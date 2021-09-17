import java.util.ArrayList;
import java.util.List;

/**
 * @date:2021-4-12, 16:56
 * @author:ShiShc
 */

public class binaryTreePaths {
    public List<String> f(TreeNode root) {
        List<String> paths = new ArrayList<>();
        help(root, "", paths);
        return paths;
    }

    private void help(TreeNode root, String path, List<String> paths) {
        if(root != null) {
            StringBuffer currPath = new StringBuffer(path);
            currPath.append(Integer.toString(root.val));
            if(root.left == null && root.right == null) {
                paths.add(currPath.toString());
            } else {
                currPath.append("->");
                help(root.left, currPath.toString(), paths);
                help(root.right, currPath.toString(), paths);
            }
        }
    }
}
