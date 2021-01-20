package tree;

//111. 二叉树的最小深度
//给定一个二叉树，找出其最小深度。
//最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//说明: 叶子节点是指没有子节点的节点。
public class LeetCode111 {

    int minDepth = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root, 1);
        return minDepth;
    }

    public void helper(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            if (minDepth > depth) {
                minDepth = depth;
            }
        }

        if (root.left != null) {
            helper(root.left, depth + 1);
        }
        if (root.right != null) {
            helper(root.right, depth + 1);
        }

    }
}
