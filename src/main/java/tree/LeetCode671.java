package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode671 {
    List<Integer> list = new ArrayList<Integer>();

    public int findSecondMinimumValue(TreeNode root) {
        helper(root);
        Object[] arr = list.toArray();
        Arrays.sort(arr);
        int min = (int) arr[0];
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if ((int) arr[i] > min) {
                result = (int) arr[i];
                break;
            }
        }
        return result;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        helper(root.left);
        helper(root.right);

    }

}
