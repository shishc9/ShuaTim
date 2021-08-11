import java.util.HashMap;

public class LC106 {

    HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) return null;

        for(int i = 0;i < inorder.length;i ++) {
            dic.put(inorder[i], i);
        }

        return help(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode help(int[] inorder, int inorderLeft, int inorderRight, int[] postorder, int postorderLeft, int postorderRight) {
        if(postorderLeft == postorderRight) {
            return null;
        }

        int rootValue = postorder[postorderRight - 1];
        TreeNode root = new TreeNode(rootValue);

        if(postorderRight - postorderLeft == 1) return root;

        int index = dic.get(rootValue);

        root.left = help(inorder, inorderLeft, index, postorder, postorderLeft, postorderLeft + index - inorderLeft);
        root.right = help(inorder, index + 1, inorderRight, postorder, postorderLeft + index - inorderLeft, postorderRight - 1);

        return root;
    }
}
