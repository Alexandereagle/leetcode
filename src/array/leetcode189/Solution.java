package array.leetcode189;

//https://leetcode-cn.com/problems/rotate-array/
public class Solution {
    /**
     * 旋转数组
     * @param nums 数组
     * @param k 旋转k个位置
     */
    public void rotate(int[] nums, int k) {
        if (nums.length < 2 || k % nums.length == 0)
            return;
        // 旋转的长度需要小于数组的长度
        k %= nums.length;
        int left = 0;
        int right = nums.length - 1;
        int mid = nums.length - k - 1;
        reserve(nums, left, mid);
        reserve(nums, mid + 1, right);
        reserve(nums, left, right);
    }

    public void reserve(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
