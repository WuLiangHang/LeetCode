package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode107 {
    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    List<List<Integer>> lists2 = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return lists;
        }
        helper(root, 0);
        for (int i = lists.size() - 1; i >= 0; i--) {
            lists2.add(lists.get(i));
        }
        return lists2;
    }

    public void helper(TreeNode root, int level) {
        if (lists.size() == level) {
            lists.add(new ArrayList<>());
        }

        lists.get(level).add(root.val);
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }
}
