package tree;

public class LeetCode606 {
    public String tree2str(TreeNode t) {
        StringBuilder stringBuilder = helper(t, new StringBuilder());
        return stringBuilder.toString();
    }

    public StringBuilder helper(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            return stringBuilder;
        }
        stringBuilder.append(root.val);

        if (root.left != null || (root.left == null && root.right != null)) {
            stringBuilder.append("(");
            helper(root.left, stringBuilder);
            stringBuilder.append(")");
        }
        if (root.right != null) {
            stringBuilder.append("(");
            helper(root.right, stringBuilder);
            stringBuilder.append(")");
        }
        return stringBuilder;

    }
}
