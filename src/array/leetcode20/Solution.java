package array.leetcode20;

//https://leetcode-cn.com/problems/valid-parentheses/submissions/

import java.util.Stack;
class Solution {
    /**
     * 有效的括号
     * @param s 输入的字符串
     * @return 字符串的括号是都为有效括号
     */
    public boolean isValid(String s) {
        int length = s.length();
        if(length % 2 == 1)
            return false;

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c: chars){
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else {
                if(stack.isEmpty() || c != stack.peek())
                    return false;
                else stack.pop() ;
            }
        }
        return stack.isEmpty();
    }
}
