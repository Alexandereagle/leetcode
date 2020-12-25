package array.leetcode11;

// https://leetcode-cn.com/problems/container-with-most-water/

public class Solution {
    public int maxArea(int[] height) {
        int maxAreas = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (maxAreas < Math.min(height[left], height[right]) * (right - left)) {
                maxAreas = Math.min(height[left], height[right]) * (right - left);
            }
            if (height[left] < height[right]) {
                int temp = left + 1;
                while (height[temp] <= height[left] && temp < right) {
                    temp += 1;
                }
                left = temp;
            } else {
                int temp = right - 1;
                while (height[temp] <= height[right] && temp > left) {
                    temp -= 1;
                }
                right = temp;
            }
        }
        return maxAreas;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution solution = new Solution();
        int i = solution.maxArea(array);
        System.out.println(i);
    }
}
