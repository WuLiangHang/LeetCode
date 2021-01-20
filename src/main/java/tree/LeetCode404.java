package tree;

public class LeetCode404 {
    int sum;

    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return sum;
    }

    public void helper(TreeNode root) {
        // visit(root.val);
        if (root == null) {
            return;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        helper(root.left);
        helper(root.right);
    }
}
