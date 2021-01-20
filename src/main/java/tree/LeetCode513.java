package tree;

public class LeetCode513 {
    private int maxDeep = -1;
    private int value;

    public int findBottomLeftValue(TreeNode root) {
        helper(root, 0);
        return value;
    }

    public void helper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (maxDeep < depth) {
            maxDeep = depth;
            value = root.val;
        }
        helper(root.left, depth + 1);
        helper(root.right, depth + 1);
    }
}
