package stack.leetcode155;

import java.util.Deque;
import java.util.LinkedList;
//https://leetcode-cn.com/problems/min-stack/comments/
class MinStack {
    private Deque<Integer> xStack;
    private Deque<Integer> minStack;

    /**
     * 最小栈
     */
    public MinStack() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(x, minStack.peek()));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();

    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}