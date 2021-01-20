package tree;

//129. 求根到叶子节点数字之和
//给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
//例如，从根到叶子节点路径 1->2->3 代表数字 123。
//计算从根到叶子节点生成的所有数字之和。
public class LeetCode129 {
    StringBuilder stringBuilder = new StringBuilder();
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return sum;
        }
        stringBuilder.append(root.val);// 入字符串
        if (root.left == null && root.right == null) {
            sum += Integer.parseInt(stringBuilder.toString());
        }
        if (root.left != null)
            sumNumbers(root.left);
        if (root.right != null)
            sumNumbers(root.right);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return sum;
    }

}
