package tree;

public class LeetCode700 {
    int target = 0;
    TreeNode root;

    public TreeNode searchBST(TreeNode root, int val) {
        target = val;
        helper(root);
        return this.root;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        if (target == root.val) {
            this.root = root;
            return;
        } else if (target > root.val) {
            helper(root.right);
        } else {
            helper(root.left);
        }
    }
}
