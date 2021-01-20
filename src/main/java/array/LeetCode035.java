package array;

public class LeetCode035 {
    public int searchInsert(int[] nums, int target) {
        //TODO:返回需要插入的下标值
        int size = nums.length;
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return right + 1;
    }
}
