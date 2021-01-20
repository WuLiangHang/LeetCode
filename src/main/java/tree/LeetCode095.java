package tree;

import java.util.LinkedList;
import java.util.List;

public class LeetCode095 {
    // 卡特兰数
    public LinkedList<TreeNode> generate_trees(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<TreeNode>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> leftAllTrees = generate_trees(start, i - 1);
            LinkedList<TreeNode> rightAllTrees =  generate_trees(i + 1, end);
            
            for (TreeNode l : leftAllTrees) {
                for (TreeNode r : rightAllTrees) {
                    TreeNode currentTree = new TreeNode(i);
                    currentTree.left = l;
                    currentTree.right = r;
                    allTrees.add(currentTree);
                }
            }
        }
        return allTrees;
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return generate_trees(1, n);
    }

}
