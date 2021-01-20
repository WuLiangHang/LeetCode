package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode637 {
    List<Double> list = new ArrayList<Double>();
    List<Double> sums = new ArrayList<Double>();
    List<Integer> nums = new ArrayList<Integer>();

    public List<Double> averageOfLevels(TreeNode root) {

        helper(root, 0);
        for (int i = 0; i < sums.size(); i++) {
            list.add(i, sums.get(i) * 1.0 / nums.get(i));
        }
        return list;
    }

    public void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (sums.size() - 1 < level) {
            sums.add((double) root.val);
            nums.add(1);
        } else {
            sums.set(level, sums.get(level) + root.val);
            nums.set(level, nums.get(level) + 1);
        }
        helper(root.left, level + 1);
        helper(root.right, level + 1);

    }
}
