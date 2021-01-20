package tree;

public class LeetCode687 {
    int maxLength = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return maxLength;
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        int arrowLeft = 0, arrowRight = 0;
        if (root.left != null && root.left.val == root.val) {
            arrowLeft += left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            arrowRight += right + 1;
        }
        maxLength = Math.max(maxLength, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
