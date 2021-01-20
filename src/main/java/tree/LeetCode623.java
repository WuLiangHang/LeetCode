package tree;

public class LeetCode623 {
    int value;
    int depth;

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode n = new TreeNode(v);
            n.left = root;
            return n;
        }
        value = v;
        depth = d;
        helper(root, 1);
        return root;

    }

    public void helper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth == this.depth - 1) {
            TreeNode node = root.left;
            root.left = new TreeNode(value);
            root.left.left = node;
            node = root.right;
            root.right = new TreeNode(value);
            root.right.right = node;
        } else {
            helper(root.left, depth + 1);
            helper(root.right, depth + 1);
        }

    }
}
