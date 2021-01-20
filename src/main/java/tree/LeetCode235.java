package tree;

//235. 二叉搜索树的最近公共祖先
//给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
public class LeetCode235 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            // Value of p
            int pVal = p.val;
            // Value of q;
            int qVal = q.val;
            // Start from the root node of the tree
            TreeNode node = root;
            // Traverse the tree
            while (node != null) {
                // Value of ancestor/parent node.
                int parentVal = node.val;
                if (pVal > parentVal && qVal > parentVal) {
                    // If both p and q are greater than parent
                    node = node.right;
                } else if (pVal < parentVal && qVal < parentVal) {
                    // If both p and q are lesser than parent
                    node = node.left;
                } else {
                    // We have found the split point, i.e. the LCA node.
                    return node;
                }
            }
            return null;
        }
    }
}
