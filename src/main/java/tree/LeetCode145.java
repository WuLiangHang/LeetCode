package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }

    public void postorder(TreeNode root) {
        // 如果遍历到的当前节点为空，则直接返回。
        if (root == null) {
            return;
        }
        // 遍历左子树
        postorder(root.left);
        // 遍历右子树
        postorder(root.right);
        // 对节点的操作:将当前节点值添加到List中
        list.add(root.val);
    }

}
