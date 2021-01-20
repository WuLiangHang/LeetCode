package tree;

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        traverse(root);
        return root;
    }

    public void traverse(TreeNode root) {
        // 为空判断
        if (root == null) {
            return;
        }
        /**** 前序遍历位置 ****/
        // root 节点需要交换它的左右子节点
        TreeNode temp = new TreeNode(root.val);
        temp.left = root.left;
        root.left = root.right;
        root.right = temp.left;
        /**** 前序遍历位置结束 ****/
        // 让左右子节点继续翻转它们各自的子节点
        traverse(root.left);
        traverse(root.right);
    }
}
