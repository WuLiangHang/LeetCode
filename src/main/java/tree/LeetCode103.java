package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode103 {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    List<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return levels;
        }
        helper(root, 0);
        levels.addAll(list);
        return levels;
    }

    public void helper(TreeNode root, int level) {
        if (list.size() == level) {
            list.add(new LinkedList<Integer>());
        }
        if (level % 2 == 0) {
            list.get(level).add(root.val);
        } else {
            list.get(level).addFirst(root.val);
        }
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }

}
