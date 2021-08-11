import java.util.HashMap;

public class LC105 {

    HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        for(int i = 0;i < inorder.length;i ++) {
            dic.put(inorder[i], i);
        }

        return help(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode help(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if(inLeft == inRight) return null;

        int rootValue = preorder[preLeft];
        TreeNode root = new TreeNode(rootValue);

        if(inRight - inLeft == 1) return root;

        int index = dic.get(rootValue);

        root.left = help(preorder, preLeft + 1, preLeft + index - inLeft + 1, inorder, inLeft, index);
        root.right = help(preorder, preLeft + index - inLeft + 1, preRight, inorder, index + 1, inRight);

        return root;
    }
}
