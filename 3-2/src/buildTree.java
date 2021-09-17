import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/3, 21:52
 * @Auther:ShiShc
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}

public class buildTree {
    private Map<Integer, Integer> map;


    public TreeNode myBuildTree(
            int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight
    ) {
        if(preLeft > preRight) {
            return null;
        }

        int preRoot = preLeft;
        int inRoot = map.get(preorder[preRoot]);

        TreeNode root = new TreeNode(inorder[inRoot]);
        int leftSize = inRoot - inLeft;

        root.left = myBuildTree(preorder, inorder, preLeft+1, preLeft + leftSize, inLeft, inRoot - 1);
        root.right = myBuildTree(preorder, inorder, preLeft+1+leftSize, preRight, inRoot+1, inRight);

        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        map = new HashMap<>();
        for(int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, length-1, 0, length-1);
    }

    public static void main(String[] args) {

    }
}
