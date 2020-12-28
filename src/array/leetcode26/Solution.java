package array.leetcode26;
//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/

public class Solution {
    /**
     * 删除排序数组中的重复项
     * @param nums 有序数组
     * @return 多少个不重复的元素
     */
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[temp])
                nums[++temp] = nums[i];
        }
        return temp + 1;
    }
}
