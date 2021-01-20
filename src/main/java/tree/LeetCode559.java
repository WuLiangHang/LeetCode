package tree;

public class LeetCode559 {
    int maxDepth = 0;

    public int maxDepth(Node root) {
        helper(root, 1);
        return maxDepth;
    }

    public void helper(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level > maxDepth) {
            maxDepth = level;
        }
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), level + 1);
        }
    }

}
