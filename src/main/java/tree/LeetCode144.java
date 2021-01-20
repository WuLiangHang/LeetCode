package tree;

import java.util.ArrayList;
import java.util.List;

//144. 二叉树的前序遍历
//给定一个二叉树，返回它的 前序 遍历。
public class LeetCode144 {
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }

    public void inorder(TreeNode root) {
        // 如果遍历到的当前节点为空，则直接返回。
        if (root == null) {
            return;
        }
        // 前序遍历
        // 遍历左子树
        inorder(root.left);
        // 中序遍历
        // 遍历右子树
        inorder(root.right);
        // 后序遍历
        list.add(root.val);
    }
}
