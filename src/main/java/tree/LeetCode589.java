package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode589 {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        helper(root);
        return list;
    }

    public void helper(Node root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i));
        }
    }

}
