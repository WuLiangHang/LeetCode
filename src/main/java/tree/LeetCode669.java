package tree;

public class LeetCode669 {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        return helper(root, L, R);
    }

    public TreeNode helper(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val > R) {
            return helper(root.left, L, R);
        } else if (root.val < L) {
            return helper(root.right, L, R);
        }
        root.left = helper(root.left, L, R);
        root.right = helper(root.right, L, R);
        return root;
    }

}
