package tree;

public class LeetCode104 {
    int maxHeight;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 1);
        return maxHeight;
    }

    public void helper(TreeNode root, int height) {
        if (height > maxHeight) {
            maxHeight = height;
        }
        if (root.left != null) {
            helper(root.left, height + 1);
        }
        if (root.right != null) {
            helper(root.right, height + 1);
        }
    }

}
