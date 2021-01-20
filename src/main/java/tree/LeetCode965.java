package tree;

public class LeetCode965 {
    int initValue;

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        initValue = root.val;
        return helper(root);

    }

    public boolean helper(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.val != initValue) {
            return false;
        }
        return helper(root.left) && helper(root.right);
    }
}
