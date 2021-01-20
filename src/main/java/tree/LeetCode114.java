package tree;

public class LeetCode114 {
    private TreeNode pre = null;
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }

    /* 二叉树遍历模板 */
    void traverse(TreeNode root) {
        // 对节点的操作写在这里即前序遍历
        traverse(root.left);
        // 写在这里即中序遍历
        traverse(root.right);
        // 写在这里即后序遍历
    }
    
}
