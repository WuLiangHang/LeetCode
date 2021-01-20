package tree;

//112. 路径总和
//给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
//说明: 叶子节点是指没有子节点的节点。
public class LeetCode112 {
    private int sum = 0;

    public boolean hasPathSum(TreeNode root, int sum) {
        this.sum = sum;
        return preOrder(root, 0);
    }

    public boolean preOrder(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        // 判断是否为叶子节点
        if (root.left == null && root.right == null) {
            if (this.sum == sum) {
                return true;
            } else {
                return false;
            }
        }
        return preOrder(root.left, sum) || preOrder(root.right, sum);
    }
}
