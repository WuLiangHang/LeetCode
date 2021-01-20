package tree;

public class LeetCode938 {
    int L;
    int R;
    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        this.L = L;
        this.R = R;

        helper(root);
        return sum;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);

        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }
        helper(root.right);
    }
}
