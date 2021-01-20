package tree;

//124. 二叉树中的最大路径和
//给定一个非空二叉树，返回其最大路径和。
//本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
public class LeetCode124 {
    int maxSum = Integer.MIN_VALUE;

    public int maxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(maxGain(root.left), 0);
        int rightMax = Math.max(maxGain(root.right), 0);
        int value = root.val + leftMax + rightMax;
        maxSum = Math.max(maxSum, value);
        return root.val + Math.max(leftMax, rightMax);
    }

    public int maxPathSum(TreeNode root) {

        maxGain(root);
        return maxSum;
    }
}
