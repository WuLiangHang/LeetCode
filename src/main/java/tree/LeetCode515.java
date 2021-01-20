package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode515 {

    List<Integer> list = new ArrayList<Integer>();
    int maxDepth = -1;

    public List<Integer> largestValues(TreeNode root) {
        helper(root, 0);
        return list;
    }

    public void helper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (maxDepth < depth) {
            list.add(depth, root.val);
            maxDepth = depth;
        } else {
            if (list.get(depth) < root.val) {
                list.set(depth, root.val);
            }
        }

        helper(root.left, depth + 1);
        helper(root.right, depth + 1);

    }
}
