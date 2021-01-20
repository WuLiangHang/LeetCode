package tree;

import java.util.HashMap;
import java.util.Map;

public class LeetCode106 {
    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode myBuildTree(int[] inorder, int[] postorder, int inorder_left, int inorder_right, int postorder_left,
            int postorder_right) {
        if (inorder_left > inorder_right) {
            return null;
        }
        int postorder_root = postorder_right;
        // 在中序遍历中定位根节点
        int inorder_root = indexMap.get(postorder[postorder_root]);
        int size_left_subtree = inorder_root - inorder_left;
        int size_right_subtree = inorder_right - inorder_root;
        TreeNode treeNode = new TreeNode(postorder[postorder_root]);
        treeNode.right = myBuildTree(inorder, postorder, inorder_right - size_right_subtree + 1, inorder_right,
                postorder_right - size_right_subtree, postorder_right - 1);
        treeNode.left = myBuildTree(inorder, postorder, inorder_left, inorder_left + size_left_subtree - 1,
                postorder_left, postorder_left + size_left_subtree - 1);

        return treeNode;
    }
}
