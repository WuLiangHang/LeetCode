package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {

    List<String> list = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, "");
        return list;
    }

    public void helper(TreeNode root, String string) {
        if (root != null) {
            string += root.val;
            if (root.left == null && root.right == null) {
                list.add(string);
            } else {
                string += "->";
                helper(root.left, string);
                helper(root.right, string);
            }
        }
    }
}
