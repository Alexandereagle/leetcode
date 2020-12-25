package array.leetcode283;

// https://leetcode-cn.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if(i != j) {
                    nums[i] = 0;
                }
                j += 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {0,1,0,3,12};
        solution.moveZeroes(array);
        solution.printArray(array);
    }

    public void printArray(int[] array){
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}
