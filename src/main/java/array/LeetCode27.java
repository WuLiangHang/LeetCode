package array;

import org.junit.Test;

public class LeetCode27 {
    @Test
    public void test() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int right = nums.length - 1;
        for (int i = 0; i <= right; i++) {
            if (nums[i] == val) {
                nums[i] = nums[right];
                right--;
                i--;
            }
        }
        return right + 1;
    }
}
