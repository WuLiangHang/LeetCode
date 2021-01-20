package array;

public class LeetCode209 {
    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;//滑动窗口起始位置
        int subLength = 0;//滑动窗口终止位置
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                subLength = i - left + 1;
                result = subLength < result ? subLength : result;
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
