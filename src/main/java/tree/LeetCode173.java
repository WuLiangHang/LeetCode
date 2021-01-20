package tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode173 {
    class BSTIterator {
        TreeNode root;
        int currentIndex = 0;
        List<Integer> list = new ArrayList<Integer>();

        public BSTIterator(TreeNode root) {
            this.root = root;
            helper(root);
        }
        //B F D A E G C
        public void helper(TreeNode root) {
            if (root == null) {
                return;
            }
            helper(root.left);
            // list.add(root.val);
            helper(root.right);
            System.out.println(root.val);// 这里写对数据的操作
        }

        /** @return the next smallest number */
        public int next() {
            // 中序遍历
            return list.get(currentIndex++);
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            if (list.size() > currentIndex) {
                return true;
            } else {
                return false;
            }
        }
    }
}
