package dp;

import org.junit.Test;

import java.util.Arrays;

public class LeetCode300 {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length + 1];
        Arrays.fill(dp, 1);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }

    @Test
    public void test() {
        int[] testArr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(testArr));
    }
}
