package array.leetcoe70;

// https://leetcode-cn.com/problems/climbing-stairs/

import javax.swing.*;

class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int first = 1;
        int second = 2;
        int third = 0;
        for(int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.climbStairs(10);
        System.out.println(i);


    }
}
