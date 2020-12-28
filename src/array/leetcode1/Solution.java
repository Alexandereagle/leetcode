package array.leetcode1;

//https://leetcode-cn.com/problems/two-sum/submissions/
class Solution {
    /**
     * 两数之和
     * @param nums 数组
     * @param target 目标之和
     * @return 返回两个数的下标
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }
}
