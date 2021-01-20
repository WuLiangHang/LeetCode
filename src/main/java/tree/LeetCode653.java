package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode653 {
    List<Integer> list = new ArrayList<Integer>();

    public boolean findTarget(TreeNode root, int k) {

        helper(root);
        int left = 0;
        int length = list.size();
        if (length <= 1) {
            return false;
        }
        int right = length - 1;
        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum < k) {
                left++;
            } else if (sum > k) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}
