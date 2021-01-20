package tree;

import java.util.ArrayList;
import java.util.List;

//99. 恢复二叉搜索树
//二叉搜索树中的两个节点被错误地交换。
//请在不改变其结构的情况下，恢复这棵树。
public class LeetCode099 {
    List<Integer> list = new ArrayList<Integer>();
    int num1;// 小的数
    int num2;

    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root);
        for (int i = 0; i < list.size(); i++) {
            if (i != 0 && list.get(i) < list.get(i - 1)) {
                num1 = list.get(i);
            }

            if (i < list.size() - 1 && list.get(i) > list.get(i + 1)) {
                num2 = list.get(i);
            }
        }

    }

    public void helper(TreeNode root) {
        if (num1 == root.val) {
            root.val = num2;
        } else if (num2 == root.val) {
            root.val = num1;
        }
        helper(root.left);
        helper(root.right);
    }

    public void inOrder(TreeNode root) {
        if (root.left != null) {
            inOrder(root.left);
        }

        list.add(root.val);
        if (root.right != null) {
            inOrder(root.right);
        }

    }
}
