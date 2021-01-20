package tree;

public class LeetCode701 {
    int val;

    public TreeNode insertIntoBST(TreeNode root, int val) {
        this.val = val;
        return helper(root);
    }

    public TreeNode helper(TreeNode root) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = helper(root.right);
        } else {
            root.left = helper(root.left);
        }
        return root;
    }

}
