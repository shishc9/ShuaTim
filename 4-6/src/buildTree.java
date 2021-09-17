import java.util.HashMap;

/**
 * @date:2021-4-12, 10:56
 * @author:ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x;}
}

public class buildTree {
    private HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode f(int[] inorder, int[] postorder) {
        for(int i = 0;i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }

        return help(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1);
    }

    private TreeNode help(int[] inorder, int[] postorder, int inLeft, int inRight, int postLeft, int postRight) {
        if(postLeft > postRight) {
            return null;
        }
        int rootIndex = dic.get(postorder[postRight]);
        TreeNode root = new TreeNode(postorder[postRight]);
        int sizeLeftTree = rootIndex - inLeft;
        root.left = help(inorder, postorder, inLeft, inLeft+sizeLeftTree-1, postLeft, postLeft+sizeLeftTree-1);
        root.right = help(inorder, postorder, rootIndex+1, inRight, postLeft+sizeLeftTree, postRight-1);
        return root;
    }
}
