import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @date:2021-4-13, 10:50
 * @author:ShiShc
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {val = x;}
}

public class zigzagLevelOrder {
    public ArrayList<ArrayList<Integer>> f(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        boolean flag = false;
        while(!deque.isEmpty()) {
            int size = deque.size();
            TreeNode temp;

            ArrayList<Integer> list = new ArrayList<>();
            for(int i = deque.size(); i > 0; i--) {
                if(!flag) {
                    temp = deque.pollFirst();
                    if(temp.right != null) deque.addLast(temp.right);
                    if(temp.left != null) deque.addLast(temp.left);
                } else {
                    temp = deque.pollFirst();
                    if(temp.left != null) deque.addLast(temp.left);
                    if(temp.right != null) deque.addLast(temp.right);
                }
                list.add(temp.val);
            }

            flag = !flag;
            lists.add(list);
        }

        return lists;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);
        root.left.right.left = new TreeNode(100);
        root.left.right.right = new TreeNode(200);
        zigzagLevelOrder obj = new zigzagLevelOrder();
        ArrayList<ArrayList<Integer>> f = obj.f(root);
        System.out.println(f.toString());
    }
}
