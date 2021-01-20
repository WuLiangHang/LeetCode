package tree;

public class LeetCode101 {

    // 同时遍历左节点和右节点
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t2 == null || t1 == null) {
            return false;
        }
        if (t2.val != t1.val) {
            return false;
        }
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
