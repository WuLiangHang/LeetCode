package tree;

public class LeetCode897 {
    TreeNode root = null;
    TreeNode realRoot = null;
    boolean flag = true;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        this.root = new TreeNode(root.val);
        helper(root);
        return realRoot;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);

        this.root.right = new TreeNode(root.val);
        if (flag) {
            realRoot = this.root.right;
            flag = false;
        }
        this.root = this.root.right;
        helper(root.right);
    }
}
