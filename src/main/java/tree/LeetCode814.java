package tree;

public class LeetCode814 {
    public TreeNode pruneTree(TreeNode root) {
        helper(root);
        return root;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if (left == 0) {
            root.left = null;
        }
        if (right == 0) {
            root.right = null;
        }
        int sum = left + right + root.val;
        if (sum == 0) {
            root = null;
        }
        return sum;
    }
}
