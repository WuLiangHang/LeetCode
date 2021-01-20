package tree;

public class LeetCode230 {
    int k;
    int count = 0;
    int value;

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return value;
    }

    // 二叉搜索树中序遍历
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        if (++count == k) {
            value = root.val;
        }
        helper(root.right);

    }
}
