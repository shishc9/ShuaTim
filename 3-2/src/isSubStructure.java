/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/4, 9:26
 * @Auther:ShiShc
 */

public class isSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B)|| isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    boolean recur(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }

    public static void main(String[] args) {

    }
}
