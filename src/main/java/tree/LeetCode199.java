package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode199 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNode root, int n) {
        if (root == null)
            return;
        if (n == list.size())// 只加一次
            list.add(root.val);
        helper(root.right, n + 1);
        helper(root.left, n + 1);
    }
}
