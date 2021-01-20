package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LeetCode863 {

    Map<TreeNode, TreeNode> parent;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        parent = new HashMap<>();
        dfs(root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(target);

        Set<TreeNode> set = new HashSet<>();
        set.add(null);
        set.add(target);

        int dist = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (dist == K) {
                    List<Integer> list = new ArrayList<>();
                    for (TreeNode treeNode : queue) {
                        list.add(treeNode.val);
                    }
                    return list;
                }
                queue.offer(null);
                dist++;
            } else {
                if (!set.contains(node.left)) {
                    set.add(node.left);
                    queue.offer(node.left);
                }
                if (!set.contains(node.right)) {
                    set.add(node.right);
                    queue.offer(node.right);
                }
                TreeNode par = parent.get(node);
                if (!set.contains(par)) {
                    set.add(par);
                    queue.add(par);
                }
            }
        }
        return new ArrayList<Integer>();
    }

    public void dfs(TreeNode root, TreeNode par) {
        if (root != null) {
            parent.put(root, par);
            dfs(root.left, root);
            dfs(root.right, root);
        }
    }

}
