package array.leetcode84;
//https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
class Solution {
    /**
     * 柱状图中最大矩形, 暴力求解 O(N^2)
     * @param heights 输入数组
     * @return 输出最大的面积
     */
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int min = heights[i];
            for (int j = i; j < heights.length; j++) {
                min = Math.min(min, heights[j]);
                maxArea = Math.max(maxArea, (j - i + 1) * min);
            }
        }
        return maxArea;
    }



    public static void main(String[] args) {
        int[] ints = {2,1,5,6,2,3};
        Solution solution = new Solution();
        System.out.println(solution.largestRectangleArea(ints));
    }
}
