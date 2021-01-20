package tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode449 {

    // public static void main(String[] args) {
    // LeetCode449 codec = new LeetCode449();
    // codec.deserialize("2,1,3");
    // }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = ser_help(root, new StringBuilder());
        return stringBuilder.toString();
    }

    public StringBuilder ser_help(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            stringBuilder.append("null,");
            return stringBuilder;
        }
        stringBuilder.append(root.val);
        stringBuilder.append(",");
        stringBuilder = ser_help(root.left, stringBuilder);
        stringBuilder = ser_help(root.right, stringBuilder);
        return stringBuilder;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str = data.split(",");
        List<String> list = new LinkedList<String>(Arrays.asList(str));
        return deser_help(list);
    }

    public TreeNode deser_help(List<String> list) {
        if (list.get(0).equals("null")) {
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left = deser_help(list);
        root.right = deser_help(list);
        return root;
    }
}
