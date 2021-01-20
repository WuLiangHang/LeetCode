package tree;

public class LeetCode538 {
    int preSum = 0;
    TreeNode t;

    public TreeNode convertBST(TreeNode root) {
        t = root;
        helper(root);
        return t;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.right);
        preSum += root.val;
        root.val = preSum;
        helper(root.left);
    }
}
