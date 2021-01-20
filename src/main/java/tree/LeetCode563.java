package tree;

public class LeetCode563 {
    int tilt;

    public int findTilt(TreeNode root) {
        traverse(root);
        return tilt;
    }

    public int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = traverse(root.left);
            int right = traverse(root.right);
            tilt += Math.abs(left - right);
            return left + right + root.val;
        }

    }
}
