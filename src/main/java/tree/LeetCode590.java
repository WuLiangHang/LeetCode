package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode590 {

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> postorder(Node root) {
        helper(root);
        return list;
    }

    public void helper(Node root) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i));
        }
        list.add(root.val);
    }

}
