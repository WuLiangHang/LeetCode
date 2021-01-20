package hashtable;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] nums = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            nums[index++] = iterator.next();
        }
        return nums;
    }

    @Test
    public void test() {
        List list = Arrays.asList(new int[]{1, 2, 3}, new int[]{2, 3, 4});
        System.out.println(list);
    }
}
