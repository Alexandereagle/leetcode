package array.leetcode66;

//https://leetcode-cn.com/problems/plus-one/submissions/
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length < 1)
            return digits;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] digs = new int[digits.length + 1];
        digs[0] = 1;
        return digs;
    }
}
